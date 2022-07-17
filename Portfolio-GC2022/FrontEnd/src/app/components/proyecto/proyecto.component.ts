import { Component, OnInit } from '@angular/core';
import { proyecto } from 'src/app/model/proyecto.model';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})
export class ProyectoComponent implements OnInit {

  proyectos:any;

  constructor(private datosProyectos: ProyectoService) { }

  ngOnInit(): void {
    this.datosProyectos.obtenerDatos().subscribe(data =>{
      this.proyectos = data;})
    }
  }

