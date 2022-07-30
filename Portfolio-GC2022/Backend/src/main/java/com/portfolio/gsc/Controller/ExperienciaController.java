package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Experiencia;
import com.portfolio.gsc.Interface.IExperienciaService;
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
public class ExperienciaController {
 @Autowired IExperienciaService iexperienciaService;
 
 @GetMapping("experiencias/traer")
 public List<Experiencia> getExperiencia(){
 return iexperienciaService.getExperiencia();
 }
 
 @PostMapping("/experiencias/crear")
 public String createExperiencia(@RequestBody Experiencia experiencia){
 iexperienciaService.saveExperiencia(experiencia);
 return "La experiencia fue creada exitosamente";
 }
 
 @DeleteMapping("/experiencias/borrar/{id}")
 public String deleteExperiencia(@PathVariable Long id){
     iexperienciaService.deleteExperiencia(id);
     return "La experiencia fue eliminada exitosamente";
 }
 //URL:PUERTO/experiencias/editar/(id)/empresa & fecha inicio & fecha fin & cargo & descripcin
 @PutMapping("/experiencias/editar/{id}")
 public ResponseEntity<Experiencia>editExperiencia(@PathVariable Long id,
        @RequestBody Experiencia e) {
    Experiencia nuevaExp = iexperienciaService.findExperiencia(id);
       
    nuevaExp.setEmpresa(e.getEmpresa());
    nuevaExp.setFecha_inicio(e.getFecha_inicio());
    nuevaExp.setFecha_fin(e.getFecha_fin());
    nuevaExp.setCargo(e.getCargo());
    nuevaExp.setDescripcion(e.getDescripcion());
    
    iexperienciaService.saveExperiencia(nuevaExp);
    return ResponseEntity.ok(nuevaExp);     
 }
 
 @GetMapping("/experiencias/traer/perfil")
public Experiencia findExperiencia(){
    return iexperienciaService.findExperiencia((long)1);
}
@GetMapping("/experiencias/details/{id}")
public Experiencia findExperiencia(@PathVariable Long id){
    return iexperienciaService.findExperiencia(id);
}
}