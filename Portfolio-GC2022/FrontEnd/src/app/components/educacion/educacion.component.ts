import { Component, OnInit } from '@angular/core';
import { Educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  educacion: any;
  
  constructor(private datosEducacion: EducacionService, private educacionservice: EducacionService) { }

  ngOnInit(): void {
    this.datosEducacion.obtenerDatos().subscribe(data => {
      this.educacion = data;})
  }
  eliminar_educacion(id:number) {
    this.educacionservice.eliminarEducacion(id).subscribe(data => {
      alert ("¿Desea realmente eliminar el estudio seleccionado?")
      });
      location.reload();
      }

}
