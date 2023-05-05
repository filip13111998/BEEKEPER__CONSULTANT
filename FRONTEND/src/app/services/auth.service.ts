import { Injectable } from '@angular/core';
import { LoginInterface } from '../model/LoginInterface';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { TokenInterface } from '../model/TokenInterface';
import { Observable, throwError } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AuthService {
  private path = "http://localhost:8080/auth"

  constructor(private http: HttpClient) { }

  login(entity: LoginInterface):Observable<TokenInterface> {
    console.log('login request send');
    return this.http.post<TokenInterface>( this.path + '/login' , entity );
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
