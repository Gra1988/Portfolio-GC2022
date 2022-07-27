package com.portfolio.gsc.Controller;

import com.portfolio.gsc.Entity.Portada;
import com.portfolio.gsc.Interface.IPortadaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PortadaController {

    @Autowired
    IPortadaService iportadaService;
   
    @PostMapping("/portadas/crear")
    public String createPortada(@RequestBody Portada portada) {
        iportadaService.savePortada(portada);
        return "Su portada fue añadida exitosamente";
    }

    @PutMapping("/portadas/editar/{id}")
    public ResponseEntity<Portada> editPortada(@PathVariable Long id,
            @RequestBody Portada p) {
        Portada nuevaPort = iportadaService.findPortada(id);

        nuevaPort.setImgportada(p.getImgportada());

        iportadaService.savePortada(nuevaPort);
        return ResponseEntity.ok(nuevaPort);
    }

    @GetMapping("/portadas/details/{id}")
    public Portada findPortada(@PathVariable Long id) {
        return iportadaService.findPortada(id);
    }
    @GetMapping("portadas/traer")
    public List<Portada> getPortada() {
        return iportadaService.getPortada();
    }

}

