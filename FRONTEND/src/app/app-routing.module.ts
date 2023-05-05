import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './components/login/login.component';
import { HomeComponent } from './components/home/home.component';
import { TestService } from './services/test.service';
import { TestComponent } from './components/test/test.component';

const routes: Routes = [
  {path:'login', component:LoginComponent},
  {path:'home/:id', component:TestComponent},
  {path:'home', component:HomeComponent},
  // {path:'test', component:TestComponent},
  // { path: '**', component: LoginComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
