import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-new-educacion',
  templateUrl: './new-educacion.component.html',
  styleUrls: ['./new-educacion.component.css']
})
export class NewEducacionComponent implements OnInit {
  educacion: Educacion = new Educacion

  constructor(private educacionservice: EducacionService, private router: Router) { }

  ngOnInit(): void {
  }

  crearEducacion(){
    this.educacionservice.agregarEducacion(this.educacion).subscribe(dato =>{
      console.log(dato);
    },error => console.log(error));
  }
  irAInicio(){
    this.router.navigate(['/home'])
  }
  onCreate(): void{
    this.crearEducacion();
    alert("Su nuevo estudio fue agregado correctamente");
    this.irAInicio();
      }  
  
}
