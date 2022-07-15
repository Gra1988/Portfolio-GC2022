import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { educacion } from '../model/educacion.model';

@Injectable({
  providedIn: 'root'
})
export class EducacionService {
  URL = 'http://localhost:8080/educacion/';

  constructor(private http: HttpClient) { }
  
  obtenerDatos(): Observable<any>{
    return this.http.get(this.URL+'traer');
  }
}
