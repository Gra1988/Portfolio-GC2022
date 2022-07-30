package com.portfolio.gsc.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Experiencia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String empresa;
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String fecha_inicio;
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String fecha_fin;
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String cargo;
    @NotNull
    @Size(min = 1, max = 500, message = "no cumple con la longitud")
    private String descripcion;
    
public Experiencia(){
          
      }
      public Experiencia(Long id, String empresa, String fecha_inicio, String fecha_fin, String cargo, String descripcion){
          this.id = id;
          this.empresa = empresa;
          this.fecha_inicio = fecha_inicio;
          this.fecha_fin = fecha_fin;
          this.cargo = cargo;
          this.descripcion = descripcion;
      }
}
    
    
