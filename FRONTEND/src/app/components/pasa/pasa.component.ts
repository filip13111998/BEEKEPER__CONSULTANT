import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { PasaFormInterface } from 'src/app/model/PasaFormInterface';
import { PasaInterface } from 'src/app/model/PasaInterface';
import { BeeService } from 'src/app/services/bee.service';

@Component({
  selector: 'app-pasa',
  templateUrl: './pasa.component.html',
  styleUrls: ['./pasa.component.css']
})
export class PasaComponent {

  displayedColumns: string[] = [ 'id', 'godina' , 'tip', 'ocena'];

  pase : PasaInterface[] = [];

  ocenaForm = new FormGroup({
    id: new FormControl({ value: '', disabled: true }),
    ocena: new FormControl({ value: '', disabled: true })
  })

  tip_pasa = ["LIVADA","BAGREM","LIPA","ULJANA_REPICA","VOCE","SUMSKA_PASA","SUNCOKRET"];
  godine = ["1","2","3","4","5","6","7","8","9","10"];

  // dan : DanInterface = {
  //   "jacina_vetra":0,
  //   "temperatura":0,
  //   "vlaznost_vazduha":0,
  //   "tip_dana":""
  // };

  historyForm = new FormGroup({
    tip: new FormControl(''),
    godine: new FormControl(''),
    ocena: new FormControl({ value: '', disabled: true })
  })

  historyInterface : PasaFormInterface = {
    "tip":"",
    "godina":0
  };


  constructor(private beeService : BeeService) {}

  ngOnInit(): void {
    this.getAllPasa();
  }

  public getAllPasa(){
    this.beeService.getAllPasa().subscribe( (data) => {
        this.pase = data;
      }
    )

  }

  public ocena(id:number){
    this.beeService.pasaOcena(id).subscribe( (data) => {
        // this.pase = data;
        this.ocenaForm.patchValue({ id: id + '' });
        this.ocenaForm.patchValue({ ocena: data.ocena + '' });
      }
    )

  }

  public history(){

    this.historyInterface.tip = this.historyForm.value.tip!;
    this.historyInterface.godina = parseInt(this.historyForm.value.godine!);

    this.beeService.pasaIstorija(this.historyInterface).subscribe( (data) => {
      this.historyForm.patchValue({ ocena:data.text});
    }
  )
  }

}
