package edu.udea.relaciones.Relaciones.servicio;

import edu.udea.relaciones.Relaciones.models.Estudiante;
import edu.udea.relaciones.Relaciones.repositorio.EstudianteRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstudianteService {

    @Autowired
    private EstudianteRepositorio estudianteRepositorio;

    public List<Estudiante> getEstudiante(){
        return estudianteRepositorio.findAll();
    }

    public Estudiante getEstudiante(int idMentor){
        return estudianteRepositorio.findByMentorNumeroDocumentoMentor(idMentor);
    }

    public List<Estudiante> getEstudiantes(String codigoGrupo){
        return estudianteRepositorio.findByGrupoCodigoGrupo(codigoGrupo);
    }

    public Estudiante save(Estudiante estudiante){
        return estudianteRepositorio.save(estudiante);
    }
}
