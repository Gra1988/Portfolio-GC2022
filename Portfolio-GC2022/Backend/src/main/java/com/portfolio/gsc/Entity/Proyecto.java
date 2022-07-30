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
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
    
 @NotNull
 @Size(min = 1, max =100, message = "No cumple con la longitud")     
private String nombre;
 
 @NotNull
 @Size(min = 1, max =100, message = "No cumple con la longitud") 
private String descripcion;
 
 @NotNull
 @Size(min = 1, max = 1000, message = "No cumple con la longitud")  
private String img;
 
 public Proyecto(){
          
      }
      public Proyecto(Long id, String nombre, String descripcion, String img){
          this.id = id;
          this.nombre = nombre;
          this.descripcion = descripcion;
          this.img = img;
                    
      }

}
