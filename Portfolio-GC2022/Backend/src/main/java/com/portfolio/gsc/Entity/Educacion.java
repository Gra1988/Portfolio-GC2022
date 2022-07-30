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
public class Educacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotNull
    @Size(min = 1, max =100, message = "No cumple con la longitud")    
    private String institucion;    
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String titulo;
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String fecha_inicio;
    @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String fecha_fin;         
     @NotNull
    @Size(min = 1, max = 100, message = "No cumple con la longitud")
    private String promedio; 
     
     public Educacion(){
          
      }
      public Educacion(Long id, String institucion, String titulo, String fecha_inicio, String fecha_fin, String promedio){
          this.id = id;
          this.institucion = institucion;
          this.titulo = titulo;
          this.fecha_inicio = fecha_inicio;
          this.fecha_fin = fecha_fin;
          this.promedio = promedio;
          
      }
}
    

