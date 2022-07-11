package com.portfolio.gsc.Interface;

import com.portfolio.gsc.Entity.Educacion;
import java.util.List;

public interface IEducacionService {
    //Traer una lista de educacion
    public List<Educacion> getEducacion();

//Guardar un objeto de tipo Educacion
public void saveEducacion(Educacion educacion);

//Eliminar un objeto por ID
public void deleteEducacion(Long id);

//Buscar una educacion por ID
public Educacion findEducacion(Long id);
    
}
