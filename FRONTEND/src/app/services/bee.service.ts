import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable, throwError } from 'rxjs';
import { KosnicaInterface } from '../model/KosnicaInterface';
import { OcenaInterface } from '../model/OcenaInterface';
import { DanInterface } from '../model/DanInterface';
import { NadmorskaVisinaInterface } from '../model/NadmorskaVisinaInterface';
import { PrirodaInterface } from '../model/PrirodaInterface';
import { PasaInterface } from '../model/PasaInterface';
import { PasaFormInterface } from '../model/PasaFormInterface';
import { IstorijaInterface } from '../model/IstorijaInterface';

@Injectable({
  providedIn: 'root'
})
export class BeeService {

  private path = "http://localhost:8080/all"

  constructor(private http: HttpClient) { }

  kosnicaOcena(entity: KosnicaInterface):Observable<OcenaInterface> {
    return this.http.post<OcenaInterface>( this.path + '/kosnica/ocena' , entity );
  }

  danOcena(entity: DanInterface):Observable<OcenaInterface> {
    return this.http.post<OcenaInterface>( this.path + '/dan/ocena' , entity );
  }

  nadmorskaVisinaOcena(entity: NadmorskaVisinaInterface):Observable<OcenaInterface> {
    return this.http.post<OcenaInterface>( this.path + '/nadmorska-visina/ocena' , entity );
  }

  prirodaOcena(entity: PrirodaInterface):Observable<OcenaInterface> {
    return this.http.post<OcenaInterface>( this.path + '/priroda/ocena' , entity );
  }

  pasaOcena(id: number):Observable<OcenaInterface> {
    return this.http.get<OcenaInterface>( this.path + `/pasa/${id}`  );
  }

  getAllPasa():Observable<PasaInterface[]> {
    return this.http.get<PasaInterface[]>( this.path + `/pasa/all`  );
  }

  pasaIstorija(entity: PasaFormInterface):Observable<IstorijaInterface> {
    console.log(entity);
    return this.http.post<IstorijaInterface>( this.path + `/pasa/istorija`, entity );
  }

  // registerCitizen(entity: CitizenRegisterInterface) {
  //   console.log('register-citizen request send');
  //   return this.http.post( this.path + '/register-citizen' , entity );
  // }

  error(error: HttpErrorResponse) {
    let errorMessage = '';
    if (error.error instanceof ErrorEvent) {
      errorMessage = error.error.message;
    } else {
      errorMessage = `Error Code: ${error.status}\nMessage: ${error.message}`;
    }
    console.log(errorMessage);
    return throwError(() => {
      return errorMessage;
    });
  }
}
