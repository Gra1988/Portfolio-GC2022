import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Portada } from 'src/app/model/portada.model';
import { PortadaService } from 'src/app/service/portada.service';

@Component({
  selector: 'app-editar-portada',
  templateUrl: './editar-portada.component.html',
  styleUrls: ['./editar-portada.component.css']
})
export class EditarPortadaComponent implements OnInit {
  editPort: Portada = new Portada();

  constructor(private portadaservice: PortadaService, private router: Router, private activatedRoute: ActivatedRoute) { }

  ngOnInit(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.portadaservice.details(id).subscribe(
      data => {
        this.editPort = data
      })
      }

  onUpdate(): void {
    const id = this.activatedRoute.snapshot.params['id'];
    this.portadaservice.editarPortada(id, this.editPort).subscribe(data => {
      alert("Su portada fue reemplazada correctamente")
      this.router.navigate(['home']);
    }
    )
  }

}
