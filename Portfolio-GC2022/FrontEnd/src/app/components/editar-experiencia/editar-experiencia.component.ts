import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Experiencia } from 'src/app/model/experiencia.model';
import { ExperienciaService } from 'src/app/service/experiencia.service';

@Component({
  selector: 'app-editar-experiencia',
  templateUrl: './editar-experiencia.component.html',
  styleUrls: ['./editar-experiencia.component.css']
})
export class EditarExperienciaComponent implements OnInit {
  editExp: Experiencia = new Experiencia();

  constructor(private experienciaservice: ExperienciaService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.experienciaservice.details(id).subscribe(
      data => {
        this.editExp = data
      })
      }

  onUpdate(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.experienciaservice.editarExperiencia(id, this.editExp).subscribe(data => {
      alert("Experiencia editada correctamente")
      this.router.navigate(['home']);
    }
    )
  }
}