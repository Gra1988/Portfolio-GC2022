package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Experiencia;
import com.portfolio.gsc.Interface.IExperienciaService;
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
 public Experiencia editExperiencia(@PathVariable Long id,
                                         @RequestParam("empresa") String nuevoEmpresa,
                                         @RequestParam("fecha_inicio") String nuevoFecha_inicio,
                                         @RequestParam("fecha_fin") String nuevoFecha_fin,
                                         @RequestParam("cargo") String nuevoCargo,
                                         @RequestParam("descripcion") String nuevoDescripcion){
     
     Experiencia experiencia = iexperienciaService.findExperiencia(id);
     
     experiencia.setEmpresa(nuevoEmpresa);
     experiencia.setFecha_inicio(nuevoFecha_inicio);
     experiencia.setFecha_fin(nuevoFecha_fin);
     experiencia.setCargo(nuevoCargo);
     experiencia.setDescripcion(nuevoDescripcion);
     
     iexperienciaService.saveExperiencia(experiencia);
     return experiencia;
     
 
 }
 
 @GetMapping("/experiencias/traer/perfil")
public Experiencia findExperiencia(){
    return iexperienciaService.findExperiencia((long)1);
}
}