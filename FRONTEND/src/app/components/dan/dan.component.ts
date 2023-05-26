import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { DanInterface } from 'src/app/model/DanInterface';
import { OcenaInterface } from 'src/app/model/OcenaInterface';
import { BeeService } from 'src/app/services/bee.service';

@Component({
  selector: 'app-dan',
  templateUrl: './dan.component.html',
  styleUrls: ['./dan.component.css']
})
export class DanComponent {

  tip_dana = ["SUNCE","OBLAK","KISA","SNEG","MAGLA"];

  dan : DanInterface = {
    "jacina_vetra":0,
    "temperatura":0,
    "vlaznost_vazduha":0,
    "tip_dana":""
  };

  danForm = new FormGroup({
    temperatura: new FormControl(''),
    vlaznost_vazduha: new FormControl(''),
    jacina_vetra: new FormControl(''),
    tip_dana: new FormControl(''),
    ocena: new FormControl({ value: '', disabled: true })
  })

  constructor(private beeService : BeeService ) {}

  ngOnInit(): void {
  }

  public ocena(){

    this.dan.temperatura = parseInt(this.danForm.value.temperatura!);
    this.dan.vlaznost_vazduha = parseInt(this.danForm.value.vlaznost_vazduha!);
    this.dan.jacina_vetra = parseInt(this.danForm.value.jacina_vetra!);
    this.dan.tip_dana = this.danForm.value.tip_dana!;

    this.beeService.danOcena(this.dan).subscribe(data => {
      console.log('USAO');console.log(data.ocena);
      this.danForm.get('ocena')!.enable(); // Enable the form control
      this.danForm.patchValue({ ocena: data.ocena + '' }); // Update form control value

    });

  }

}
