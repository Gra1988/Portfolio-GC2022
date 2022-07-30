import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Experiencia } from '../model/experiencia.model';

@Injectable({
  providedIn: 'root'
})

export class ExperienciaService {
  URL = 'http://localhost:8080/experiencias/'

  constructor(private http: HttpClient) { }
  
  obtenerDatos():Observable<any>{
    return this.http.get(this.URL+'traer');
  }
  editarExperiencia(id: number, Experiencia:Experiencia):Observable<object>{
    return this.http.put(`${this.URL}editar/${id}`,Experiencia);
  }

  public details(id:number):Observable<Experiencia>{
    return this.http.get<Experiencia>(`${this.URL}details/${id}`);
  }

  agregarExperiencia(experiencia:Experiencia):Observable<object>{
    return this.http.post(`${this.URL}crear`,experiencia);
  }

  eliminarExperiencia(id: number): Observable<object>{
    return this.http.delete(`${this.URL}borrar/${id}`)
  }
}