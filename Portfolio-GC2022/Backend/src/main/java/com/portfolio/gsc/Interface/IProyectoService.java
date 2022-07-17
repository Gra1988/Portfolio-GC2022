package com.portfolio.gsc.Interface;

import com.portfolio.gsc.Entity.Proyecto;
import java.util.List;


public interface IProyectoService {
    //Traer una lista de proyectos
    public List<Proyecto> getProyecto();

//Guardar un objeto de tipo Proyecto
public void saveProyecto(Proyecto proyecto);

//Eliminar un objeto por ID
public void deleteProyecto(Long id);

//Buscar un proyecto por ID
public Proyecto findProyecto(Long id);
    
}
