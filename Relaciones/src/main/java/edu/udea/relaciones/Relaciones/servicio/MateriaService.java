package edu.udea.relaciones.Relaciones.servicio;

import edu.udea.relaciones.Relaciones.models.Materia;
import edu.udea.relaciones.Relaciones.repositorio.MateriaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MateriaService {

    @Autowired
    private MateriaRepositorio materiaRepositorio;

    public List<Materia> getMateria(){
        return materiaRepositorio.findAll();
    }

    public Materia save(Materia materia){
        return materiaRepositorio.save(materia);
    }
}
