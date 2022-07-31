import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { LogoAPComponent } from './components/logo-ap/logo-ap.component';
import { BannerComponent } from './components/banner/banner.component';
import { AcercaDeComponent } from './components/acerca-de/acerca-de.component';
import { ExperienciaComponent } from './components/experiencia/experiencia.component';
import { EducacionComponent } from './components/educacion/educacion.component';
import { NgCircleProgressModule } from 'ng-circle-progress';
import { HysComponent } from './components/hys/hys.component';
import { ProyectoComponent } from './components/proyecto/proyecto.component';
import { FooterComponent } from './components/footer/footer.component';
import { HttpClientModule } from '@angular/common/http';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { EditarPortadaComponent } from './components/editar-portada/editar-portada.component';
import { EditarAcercaDeComponent } from './components/editar-acerca-de/editar-acerca-de.component';
import { EditarExperienciaComponent } from './components/editar-experiencia/editar-experiencia.component';
import { NewExperienciaComponent } from './components/experiencia/new-experiencia.component';
import { NewEducacionComponent } from './components/educacion/new-educacion.component';
import { EditarEducacionComponent } from './components/editar-educacion/editar-educacion.component';
import { NewProyectoComponent } from './components/proyecto/new-proyecto.component';
import { EditarProyectoComponent } from './components/editar-proyecto/editar-proyecto.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { environment } from 'src/environments/environment.prod';
import { AngularFireModule } from '@angular/fire/compat';
import { NavbarComponent } from './components/logo-ap/navbar.component';
import { RegisterComponent } from './components/register/register.component';



@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    LogoAPComponent,
    BannerComponent,
    AcercaDeComponent,
    ExperienciaComponent,
    EducacionComponent,
    HysComponent,
    ProyectoComponent,
    FooterComponent,
    HomeComponent,
    LoginComponent,
    EditarPortadaComponent,
    EditarAcercaDeComponent,
    EditarExperienciaComponent,
    NewExperienciaComponent,
    NewEducacionComponent,
    EditarEducacionComponent,
    NewProyectoComponent,
    EditarProyectoComponent,
    NavbarComponent,
    RegisterComponent,
    
    
    
    
  
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    NgCircleProgressModule.forRoot({}),
    HttpClientModule,
    ReactiveFormsModule,
    FormsModule,
    AngularFireModule.initializeApp(environment.firebaseConfig),
    BrowserAnimationsModule,
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
