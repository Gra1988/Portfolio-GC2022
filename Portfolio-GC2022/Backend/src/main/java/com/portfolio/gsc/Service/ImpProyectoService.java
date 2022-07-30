package com.portfolio.gsc.Service;

import com.portfolio.gsc.Entity.Proyecto;
import com.portfolio.gsc.Interface.IProyectoService;
import com.portfolio.gsc.Repository.IProyectoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
 public class ImpProyectoService implements IProyectoService {
    @Autowired IProyectoRepository iproyectoRepository;

    @Override
    public List<Proyecto> getProyecto() {
       List<Proyecto> proyecto = iproyectoRepository.findAll();
       return proyecto;
    }

    @Override
    public void saveProyecto(Proyecto proyecto) {
        iproyectoRepository.save(proyecto);
    }

    @Override
    public void deleteProyecto(Long id) {
       iproyectoRepository.deleteById(id);
    }

    @Override
    public Proyecto findProyecto(Long id) {
       Proyecto proyecto = iproyectoRepository.findById(id).orElse(null);
       return proyecto;
    }
    
}
    

