import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Educacion } from 'src/app/model/educacion.model';
import { EducacionService } from 'src/app/service/educacion.service';

@Component({
  selector: 'app-editar-educacion',
  templateUrl: './editar-educacion.component.html',
  styleUrls: ['./editar-educacion.component.css']
})
export class EditarEducacionComponent implements OnInit {
  editEdu: Educacion = new Educacion();

  constructor(private educacionservice: EducacionService, private router: Router, private activatedRoute: ActivatedRoute) { }
  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.educacionservice.details(id).subscribe(
      data => {
        this.editEdu = data
      })
  }
  onUpdate(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.educacionservice.editarEducacion(id, this.editEdu).subscribe(data => {
      alert("Estudio editado correctamente")
      this.router.navigate(['home']);
    }
    )
  }

}
