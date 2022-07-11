package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Educacion;
import com.portfolio.gsc.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class EducacionController {
@Autowired IEducacionService ieducacionService;

@GetMapping("educacion/traer")
public List<Educacion> getEducacion(){
    return ieducacionService.getEducacion();
    
}

@PostMapping("/educacion/crear")
 public String createEducacion(@RequestBody Educacion educacion){
 ieducacionService.saveEducacion(educacion);
 return "La educacion fue creada exitosamente";
 }
 
 @DeleteMapping("/educacion/borrar/{id}")
 public String deleteEducacion(@PathVariable Long id){
     ieducacionService.deleteEducacion(id);
     return "La educacion fue eliminada exitosamente";
 }
 //URL:PUERTO/educacion/editar/(id)/institucion & titulo & fecha inicio & fecha fin & promedio
 @PutMapping("/educacion/editar/{id}")
 public Educacion editEducacion(@PathVariable Long id,
                                         @RequestParam("institucion") String nuevoInstitucion,
                                         @RequestParam("titulo") String nuevoTitulo,
                                         @RequestParam("fecha_inicio") String nuevoFecha_inicio,
                                         @RequestParam("fecha_fin") String nuevoFecha_fin,
                                         @RequestParam("promedio") String nuevoPromedio){
     
     Educacion educacion = ieducacionService.findEducacion(id);
     
     educacion.setInstitucion(nuevoInstitucion);
     educacion.setTitulo(nuevoTitulo);
     educacion.setFecha_inicio(nuevoFecha_inicio);
     educacion.setFecha_fin(nuevoFecha_fin);
     educacion.setPromedio(nuevoPromedio);
     
     ieducacionService.saveEducacion(educacion);
     return educacion;
     
 
 }
 
 @GetMapping("/educacion/traer/perfil")
public Educacion findEducacion(){
    return ieducacionService.findEducacion((long)1);
}
}

