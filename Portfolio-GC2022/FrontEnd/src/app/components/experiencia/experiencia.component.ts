import { Component, OnInit } from '@angular/core';
import { Experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-experiencia',
  templateUrl: './experiencia.component.html',
  styleUrls: ['./experiencia.component.css']
})
export class ExperienciaComponent implements OnInit {
  
  experiencias:any;

  constructor(private datosExperiencias: ExperienciaService, private experienciaservice: ExperienciaService) { }

  ngOnInit(): void {
    this.datosExperiencias.obtenerDatos().subscribe(data =>{
      this.experiencias = data;})
    }
    eliminar_experiencia(id:number) {
      this.experienciaservice.eliminarExperiencia(id).subscribe(data => {
        alert ("¿Desea realmente eliminar la experiencia seleccionada?")
        });
        location.reload();
        }
  }
  



