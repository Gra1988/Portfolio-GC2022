import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from 'src/app/service/auth.service';
import { PersonaService } from 'src/app/service/persona.service';

@Component({
  selector: 'app-acerca-de',
  templateUrl: './acerca-de.component.html',
  styleUrls: ['./acerca-de.component.css']
})
export class AcercaDeComponent implements OnInit {
  personas: any
  constructor(private datosPersona: PersonaService, private personaservice: PersonaService, private router: Router, private authService: AuthService) { }
  
  ngOnInit(): void {
    this.datosPersona.obtenerDatos().subscribe(data => {
      this.personas = data;
    })
  }
  public onEdit(id:number){
    this.router.navigate(['editar-persona',id])
  }
  

  eliminar_persona(id:number) {
    this.personaservice.eliminarPersona(id).subscribe(data => {
      });
      location.reload();
      }
      userLogged = this.authService.getUserLogged();
}

