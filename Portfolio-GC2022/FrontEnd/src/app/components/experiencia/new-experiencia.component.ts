import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-new-experiencia',
  templateUrl: './new-experiencia.component.html',
  styleUrls: ['./new-experiencia.component.css']
})
export class NewExperienciaComponent implements OnInit {
  experiencia: Experiencia = new Experiencia
 
  constructor(private experienciaservice: ExperienciaService, private router: Router) { }

  ngOnInit(): void {
  }

  crearExperiencia(){
    this.experienciaservice.agregarExperiencia(this.experiencia).subscribe(dato =>{
      console.log(dato);
    },error => console.log(error));
  }
  irAInicio(){
    this.router.navigate(['/home'])
  }
  onCreate(): void{
    this.crearExperiencia();
    alert("Su nueva experiencia fue agregada correctamente");
    this.irAInicio();
      }
    
  }