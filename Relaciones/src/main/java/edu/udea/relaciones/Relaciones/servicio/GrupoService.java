package edu.udea.relaciones.Relaciones.servicio;

import edu.udea.relaciones.Relaciones.models.Grupo;
import edu.udea.relaciones.Relaciones.repositorio.GrupoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrupoService {

    @Autowired
    private GrupoRepositorio grupoRepositorio;

    public List<Grupo> getGrupo(){
        return grupoRepositorio.findAll();
    }

    public Grupo save(Grupo grupo){
        return grupoRepositorio.save(grupo);
    }
}
