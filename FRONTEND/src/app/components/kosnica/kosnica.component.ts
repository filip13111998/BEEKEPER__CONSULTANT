import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { KosnicaInterface } from 'src/app/model/KosnicaInterface';
import { BeeService } from 'src/app/services/bee.service';

@Component({
  selector: 'app-kosnica',
  templateUrl: './kosnica.component.html',
  styleUrls: ['./kosnica.component.css']
})
export class KosnicaComponent {
  num = ["1","2","3","4","5","6","7","8","9","10"];

  kosnica : KosnicaInterface = {
    "broj_ramova_polena":0,
    "broj_ramova_meda":0,
    "broj_ramova_pcela":0,
    "broj_ramova_legla":0
  };

  kosnicaForm = new FormGroup({
    broj_ramova_polena: new FormControl(''),
    broj_ramova_meda: new FormControl(''),
    broj_ramova_pcela: new FormControl(''),
    broj_ramova_legla: new FormControl(''),
    ocena: new FormControl({ value: '', disabled: true })
  })

  constructor(private beeService : BeeService ) {}

  ngOnInit(): void {
  }

  public ocena(){

    this.kosnica.broj_ramova_polena = parseInt(this.kosnicaForm.value.broj_ramova_polena!);
    this.kosnica.broj_ramova_meda = parseInt(this.kosnicaForm.value.broj_ramova_meda!);
    this.kosnica.broj_ramova_pcela = parseInt(this.kosnicaForm.value.broj_ramova_pcela!);
    this.kosnica.broj_ramova_legla =parseInt(this.kosnicaForm.value.broj_ramova_pcela!);

    this.beeService.kosnicaOcena(this.kosnica).subscribe(data => {
      console.log('USAO');console.log(data.ocena);
      // this.danForm.get('ocena')!.enable(); // Enable the form control
      this.kosnicaForm.patchValue({ ocena: data.ocena + '' }); // Update form control value

    });

  }
}
