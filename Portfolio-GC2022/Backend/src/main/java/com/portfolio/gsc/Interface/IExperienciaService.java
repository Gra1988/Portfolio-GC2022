package com.portfolio.gsc.Interface;

import com.portfolio.gsc.Entity.Experiencia;
import java.util.List;

public interface IExperienciaService {
   //Traer una lista de experiencias
    public List<Experiencia> getExperiencia();

//Guardar un objeto de tipo Experiencia
public void saveExperiencia(Experiencia experiencia);

//Eliminar un objeto por ID
public void deleteExperiencia(Long id);

//Buscar una experiencia por ID
public Experiencia findExperiencia(Long id);
}