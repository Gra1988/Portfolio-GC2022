package com.portfolio.gsc.Interface;

import com.portfolio.gsc.Entity.Portada;
import java.util.List;


public interface IPortadaService {
   public void savePortada(Portada portada);
   public Portada findPortada(Long id);
   public List<Portada> getPortada();
}
