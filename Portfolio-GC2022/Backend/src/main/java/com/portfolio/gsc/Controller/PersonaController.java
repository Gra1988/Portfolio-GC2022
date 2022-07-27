package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Persona;
import com.portfolio.gsc.Interface.IPersonaService;
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
public class PersonaController {
@Autowired IPersonaService ipersonaService;

@GetMapping("personas/traer")
public List<Persona> getPersona(){
return ipersonaService.getPersona();
}
@PostMapping("/personas/crear")
public String createPersona(@RequestBody Persona persona){
ipersonaService.savePersona(persona);
return "La persona fue creada exitosamente";
}
@DeleteMapping ("/personas/borrar/{id}")
public String deletePersona(@PathVariable Long id){
ipersonaService.deletePersona(id);
return "La persona fue eliminada exitosamente";
}
//URL:PUERTO/personas/editar/(num id)/nombre,apellido,img,acercaDe
@PutMapping ("/personas/editar/{id}")
public ResponseEntity<Persona>editPersona(@PathVariable Long id,
        @RequestBody Persona e) {
    Persona nuevaPers = ipersonaService.findPersona(id);
       
    nuevaPers.setNombre(e.getNombre());
    nuevaPers.setApellido(e.getApellido());
    nuevaPers.setImg(e.getImg());
    nuevaPers.setAcercaDe(e.getAcercaDe());
    
    ipersonaService.savePersona(nuevaPers);
    return ResponseEntity.ok(nuevaPers);
}
@GetMapping("/personas/traer/perfil")
public Persona findPersona(){
    return ipersonaService.findPersona((long)1);
}
@GetMapping("/personas/details/{id}")
public Persona findPersona(@PathVariable Long id){
    return ipersonaService.findPersona(id);
}
}
