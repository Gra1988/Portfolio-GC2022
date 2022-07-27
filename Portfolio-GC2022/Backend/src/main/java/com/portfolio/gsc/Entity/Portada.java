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
public class Portada {
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
   
    @NotNull
    @Size(min = 1, max = 1000, message = "No cumple con la longitud")
    private String imgportada;
   
    public Portada(){
       
    }
    public Portada(long id, String portada){
       
        this.id = id;
        this.imgportada = imgportada;
   
}   
}
