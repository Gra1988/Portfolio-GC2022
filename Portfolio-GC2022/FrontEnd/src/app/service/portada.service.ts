import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Portada } from '../model/portada.model';

@Injectable({
  providedIn: 'root'
})
export class PortadaService {
  URL = 'http://localhost:8080/portadas/'

  constructor(private http: HttpClient) { }

  editarPortada(id: number, Portada:Portada):Observable<object>{
    return this.http.put(`${this.URL}editar/${id}`,Portada);
  }

  public details(id:number):Observable<Portada>{
    return this.http.get<Portada>(`${this.URL}details/${id}`);
  }

  obtenerDatos():Observable<any>{
    return this.http.get(this.URL+'traer');
  }
}

  