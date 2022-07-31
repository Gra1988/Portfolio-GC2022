import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EditarAcercaDeComponent } from './components/editar-acerca-de/editar-acerca-de.component';
import { EditarEducacionComponent } from './components/editar-educacion/editar-educacion.component';
import { EditarExperienciaComponent } from './components/editar-experiencia/editar-experiencia.component';
import { EditarPortadaComponent } from './components/editar-portada/editar-portada.component';
import { EditarProyectoComponent } from './components/editar-proyecto/editar-proyecto.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NewProyectoComponent } from './components/proyecto/new-proyecto.component';
import { RegisterComponent } from './components/register/register.component';

const routes: Routes = [
  {path:'home', component: HomeComponent},
  {path:'login', component: LoginComponent},
  {path:'',redirectTo:'login', pathMatch:'full'},
  {path:'editar-portada/:id', component: EditarPortadaComponent},
  {path:'editar-acerca-de/:id', component: EditarAcercaDeComponent},
  {path:'editar-experiencia/:id', component: EditarExperienciaComponent},
  {path:'editar-educacion/:id', component: EditarEducacionComponent},
  {path: 'newExp', component: NewExperienciaComponent},
  {path: 'newEdu', component: NewEducacionComponent},
  {path: 'newProy', component: NewProyectoComponent},
  {path: 'editar-proyecto/:id', component: EditarProyectoComponent},
  {path:'register', component: RegisterComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
