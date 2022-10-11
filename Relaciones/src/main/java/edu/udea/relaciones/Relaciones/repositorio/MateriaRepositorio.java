package edu.udea.relaciones.Relaciones.repositorio;

import edu.udea.relaciones.Relaciones.models.Materia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MateriaRepositorio extends JpaRepository <Materia, String> {
}
