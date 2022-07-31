import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Proyecto } from 'src/app/model/proyecto.model';
import { ProyectoService } from 'src/app/service/proyecto.service';

@Component({
  selector: 'app-new-proyecto',
  templateUrl: './new-proyecto.component.html',
  styleUrls: ['./new-proyecto.component.css']
})
export class NewProyectoComponent implements OnInit {
  proyecto: Proyecto = new Proyecto
 
  constructor(private proyectoservice: ProyectoService, private router: Router) { }

  ngOnInit(): void {
  }
  crearProyecto(){
    this.proyectoservice.agregarProyecto(this.proyecto).subscribe(dato =>{
      console.log(dato);
    },error => console.log(error));
  }
  irAInicio(){
    this.router.navigate(['/home'])
  }
  onCreate(): void{
    this.crearProyecto();
    alert("Su nuevo proyecto fue agregado correctamente");
    this.irAInicio();
      }
    
  }


