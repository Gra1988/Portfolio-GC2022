import { Component, OnInit } from '@angular/core';
import { PortadaService } from 'src/app/service/portada.service';

@Component({
  selector: 'app-banner',
  templateUrl: './banner.component.html',
  styleUrls: ['./banner.component.css']
})
export class BannerComponent implements OnInit {
portada: any
  constructor(private datosPortada: PortadaService) { }

  ngOnInit(): void {
    this.datosPortada.obtenerDatos().subscribe(data => {this.portada = data;})
  }

}
