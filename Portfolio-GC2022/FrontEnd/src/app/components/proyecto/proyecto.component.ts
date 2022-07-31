import { Component, OnInit } from '@angular/core';
import { Proyecto } from 'src/app/model/proyecto.model';
import { AuthService } from 'src/app/service/auth.service';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-proyecto',
  templateUrl: './proyecto.component.html',
  styleUrls: ['./proyecto.component.css']
})
export class ProyectoComponent implements OnInit {

  proyectos:any;

  constructor(private datosProyectos: ProyectoService, private proyectoservice: ProyectoService, private authService: AuthService) { }

  ngOnInit(): void {
    this.datosProyectos.obtenerDatos().subscribe(data =>{
      this.proyectos = data;})
    }
    eliminar_proyecto(id:number) {
      this.proyectoservice.eliminarProyecto(id).subscribe(data => {
        alert ("¿Desea realmente eliminar el proyecto seleccionado?")
        });
        location.reload();
        }
         userLogged = this.authService.getUserLogged();

  }

