package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Proyecto;
import com.portfolio.gsc.Interface.IProyectoService;
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
public class ProyectoController {
    @Autowired IProyectoService iproyectoService;
 
 @GetMapping("proyectos/traer")
 public List<Proyecto> getProyecto(){
 return iproyectoService.getProyecto();
 }
 
 @PostMapping("/proyectos/crear")
 public String createProyecto(@RequestBody Proyecto proyecto){
 iproyectoService.saveProyecto(proyecto);
 return "El proyecto fue creado exitosamente";
 }
 
 @DeleteMapping("/proyectos/borrar/{id}")
 public String deleteProyecto(@PathVariable Long id){
     iproyectoService.deleteProyecto(id);
     return "El proyecto fue eliminado exitosamente";
 }
 //URL:PUERTO/proyectos/editar/(id)/nombre & descripcion & img
 @PutMapping("/proyectos/editar/{id}")
 public Proyecto editProyecto(@PathVariable Long id,
                                         @RequestParam("nombre") String nuevoNombre,
                                         @RequestParam("descripcion") String nuevoDescripcion,
                                         @RequestParam("img") String nuevoImg){
     
     Proyecto proyecto = iproyectoService.findProyecto(id);
     
     proyecto.setNombre(nuevoNombre);
     proyecto.setDescripcion(nuevoDescripcion);
     proyecto.setImg(nuevoImg);
          
     iproyectoService.saveProyecto(proyecto);
     return proyecto;
     
 
}

 @GetMapping("/proyectos/traer/perfil")
public Proyecto findProyecto(){
    return iproyectoService.findProyecto((long)1);
}
}