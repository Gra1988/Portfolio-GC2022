package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Educacion;
import com.portfolio.gsc.Interface.IEducacionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
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
 return "El estudio fue creado exitosamente";
 }
 
 @DeleteMapping("/educacion/borrar/{id}")
 public String deleteEducacion(@PathVariable Long id){
     ieducacionService.deleteEducacion(id);
     return "El estudio fue eliminado exitosamente";
 }
 //URL:PUERTO/educacion/editar/(id)/institucion & titulo & fecha inicio & fecha fin & promedio
 @PutMapping("/educacion/editar/{id}") 
     public ResponseEntity<Educacion>editEducacion(@PathVariable Long id,
        @RequestBody Educacion e) {
    Educacion nuevaEdu = ieducacionService.findEducacion(id);
       
    nuevaEdu.setInstitucion(e.getInstitucion());
    nuevaEdu.setTitulo(e.getTitulo());
    nuevaEdu.setFecha_inicio(e.getFecha_inicio());
    nuevaEdu.setFecha_fin(e.getFecha_fin());
    nuevaEdu.setPromedio(e.getPromedio());
         
     ieducacionService.saveEducacion(nuevaEdu);
     return ResponseEntity.ok(nuevaEdu);   
 
 }
 
 @GetMapping("/educacion/traer/perfil")
public Educacion findEducacion(){
    return ieducacionService.findEducacion((long)1);
}
@GetMapping("/educacion/details/{id}")
public Educacion findEducacion(@PathVariable Long id){
    return ieducacionService.findEducacion(id);
}
}

