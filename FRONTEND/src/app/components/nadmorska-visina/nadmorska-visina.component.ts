import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { NadmorskaVisinaInterface } from 'src/app/model/NadmorskaVisinaInterface';
import { BeeService } from 'src/app/services/bee.service';

@Component({
  selector: 'app-nadmorska-visina',
  templateUrl: './nadmorska-visina.component.html',
  styleUrls: ['./nadmorska-visina.component.css']
})
export class NadmorskaVisinaComponent {

  polozaj = ["RAVNO","BRDO","DOLINA"];

  nv : NadmorskaVisinaInterface = {
    "nadmorska_visina":0,
    "polozaj_terena":""
  };

  nadmorskaForm = new FormGroup({
    nadmorska_visina: new FormControl(''),
    polozaj_terena: new FormControl(''),
    ocena: new FormControl({ value: '', disabled: true })
  })

  constructor(private beeService : BeeService ) {}

  ngOnInit(): void {
  }

  public ocena(){

    this.nv.nadmorska_visina = parseInt(this.nadmorskaForm.value.nadmorska_visina!);
    this.nv.polozaj_terena = this.nadmorskaForm.value.polozaj_terena!;

    this.beeService.nadmorskaVisinaOcena(this.nv).subscribe(data => {
      console.log('USAO');console.log(data.ocena);
      // this.danForm.get('ocena')!.enable(); // Enable the form control
      this.nadmorskaForm.patchValue({ ocena: data.ocena + '' }); // Update form control value

    });

  }

}
