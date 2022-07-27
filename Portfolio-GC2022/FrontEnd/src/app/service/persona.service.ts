import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Persona } from '../model/persona.model';

@Injectable({
  providedIn: 'root'
})

export class PersonaService {
URL = 'http://localhost:8080/personas/';

  constructor(private http:HttpClient) { }

  obtenerDatos():Observable<any>{
    return this.http.get(this.URL+'traer');
  }
  editarPersona(id: number, Persona:Persona):Observable<object>{
    return this.http.put(`${this.URL}editar/${id}`,Persona);
  }

  public details(id:number):Observable<Persona>{
    return this.http.get<Persona>(`${this.URL}details/${id}`);
  }

  agregarPersona(persona:Persona):Observable<object>{
    return this.http.post(`${this.URL}crear`,persona);
  }

  eliminarPersona(id: number): Observable<object>{
    return this.http.delete(`${this.URL}borrar/${id}`)
  }
}