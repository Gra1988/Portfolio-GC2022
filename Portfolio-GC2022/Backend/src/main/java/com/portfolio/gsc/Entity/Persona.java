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
public class Persona {    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;
    
    @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String nombre;
    
      @NotNull
    @Size(min = 1, max = 50, message = "No cumple con la longitud")
   private String apellido;
      
    @Size(min = 1, max = 1000 , message = "No cumple con la longitud")
   private String img;
    
      @NotNull
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
   private String acercaDe;
      
      public Persona(){
          
      }
      public Persona(Long id, String nombre, String apellido, String img, String acercaDe){
          this.id = id;
          this.nombre = nombre;
          this.apellido = apellido;
          this.img = img;
          this.acercaDe = acercaDe;
      }
}
