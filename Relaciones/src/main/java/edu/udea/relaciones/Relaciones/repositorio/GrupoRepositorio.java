package edu.udea.relaciones.Relaciones.repositorio;

import edu.udea.relaciones.Relaciones.models.Grupo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GrupoRepositorio extends JpaRepository <Grupo, String> {
}
