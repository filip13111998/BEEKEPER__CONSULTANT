import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { PrirodaInterface } from 'src/app/model/PrirodaInterface';
import { BeeService } from 'src/app/services/bee.service';

@Component({
  selector: 'app-priroda',
  templateUrl: './priroda.component.html',
  styleUrls: ['./priroda.component.css']
})
export class PrirodaComponent {

  priroda : PrirodaInterface = {
    "broj_biljaka":0,
    "teritorijalna_rasprostranjenost":0,
    "udaljenost_reke":0
  };

  prirodaForm = new FormGroup({
    broj_biljaka: new FormControl(''),
    teritorijalna_rasprostranjenost: new FormControl(''),
    udaljenost_reke: new FormControl(''),
    ocena: new FormControl({ value: '', disabled: true })
  })

  constructor(private beeService : BeeService ) {}

  ngOnInit(): void {
  }

  public ocena(){

    this.priroda.broj_biljaka = parseInt(this.prirodaForm.value.broj_biljaka!);
    this.priroda.teritorijalna_rasprostranjenost = parseInt(this.prirodaForm.value.teritorijalna_rasprostranjenost!);
    this.priroda.udaljenost_reke = parseInt(this.prirodaForm.value.udaljenost_reke!);

    this.beeService.prirodaOcena(this.priroda).subscribe(data => {
      console.log('USAO');console.log(data.ocena);
      // this.danForm.get('ocena')!.enable(); // Enable the form control
      this.prirodaForm.patchValue({ ocena: data.ocena + '' }); // Update form control value

    });

  }
}
