import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { TestService } from './services/test.service';
import { TestComponent } from './components/test/test.component';
import { KosnicaComponent } from './components/kosnica/kosnica.component';
import { PrirodaComponent } from './components/priroda/priroda.component';
import { NadmorskaVisinaComponent } from './components/nadmorska-visina/nadmorska-visina.component';
import { DanComponent } from './components/dan/dan.component';
import { PasaComponent } from './components/pasa/pasa.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'home/:id', component:TestComponent},
  {path:'home', component:HomeComponent},
  {path:'kosnica', component:KosnicaComponent},
  {path:'priroda', component:PrirodaComponent},
  {path:'nadmorska-visina', component:NadmorskaVisinaComponent},
  {path:'dan', component:DanComponent},
  {path:'pasa', component:PasaComponent},
  // {path:'test', component:TestComponent},
  // { path: '**', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
