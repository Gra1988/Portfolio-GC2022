import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditarPortadaComponent } from './components/editar-portada/editar-portada.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';

const routes: Routes = [
  {path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'',redirectTo:'login', pathMatch:'full'},
  {path:'editar-portada/:id', component: EditarPortadaComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
