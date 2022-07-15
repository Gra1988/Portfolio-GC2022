import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { experiencia } from '../model/experiencia.model';

@Injectable({
  providedIn: 'root'
})
export class ExperienciaService {
URL = 'http://localhost:8080/experiencias/';

  constructor(private http: HttpClient) { }

  obtenerDatos(): Observable<any>{
   return this.http.get(this.URL+ 'traer'); 
  }
}
