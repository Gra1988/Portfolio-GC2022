import { Component, OnInit } from '@angular/core';
import { educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-educacion',
  templateUrl: './educacion.component.html',
  styleUrls: ['./educacion.component.css']
})
export class EducacionComponent implements OnInit {
  educacion: any;
  
  constructor(private datosEducacion: EducacionService) { }

  ngOnInit(): void {
    this.datosEducacion.obtenerDatos().subscribe(data => {
      this.educacion = data;})
  }

}
