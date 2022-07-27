package com.portfolio.gsc.Service;

import com.portfolio.gsc.Entity.Portada;
import com.portfolio.gsc.Interface.IPortadaService;
import com.portfolio.gsc.Repository.IPortadaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ImpPortadaService implements IPortadaService{
    @Autowired IPortadaRepository iportadaRepository;
   
    @Override
    public List<Portada> getPortada() {
        List<Portada> portada = iportadaRepository.findAll();
        return portada;
    }
   
    @Override
    public void savePortada(Portada portada) {
        iportadaRepository.save(portada);
    }
   
    @Override
    public Portada findPortada(Long id) {
        Portada portada = iportadaRepository.findById(id).orElse(null);
        return portada;
    }
   
}
    