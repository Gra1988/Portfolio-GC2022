import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Persona } from 'src/app/model/persona.model';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-editar-acerca-de',
  templateUrl: './editar-acerca-de.component.html',
  styleUrls: ['./editar-acerca-de.component.css']
})
export class EditarAcercaDeComponent implements OnInit {
  editPerfil: Persona = new Persona();

  constructor(private personaservice: PersonaService, private router: Router, private activatedRoute: ActivatedRoute ) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.personaservice.details(id).
    subscribe(
      data => {
        this.editPerfil = data
      })
  }

  onUpdate(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.personaservice.editarPersona(id, this.editPerfil).subscribe(data => {
      alert("Perfil editado correctamente")
      this.router.navigate(['home']);
    }
    )
  }
}