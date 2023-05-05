import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TestService {

  constructor() {
  }

  public printer(){
    console.log('zikaa proso ispis');
  }

}
