package edu.udea.relaciones.Relaciones.servicio;

import edu.udea.relaciones.Relaciones.models.Mentor;
import edu.udea.relaciones.Relaciones.repositorio.MentorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MentorService {

    @Autowired
    private MentorRepositorio mentorRepositorio;

    public List<Mentor> getMentor(){
        return mentorRepositorio.findAll();
    }

    public Mentor save(Mentor mentor){
        return mentorRepositorio.save(mentor);
    }
}
