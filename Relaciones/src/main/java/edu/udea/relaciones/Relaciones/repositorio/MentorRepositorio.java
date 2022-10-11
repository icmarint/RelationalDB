package edu.udea.relaciones.Relaciones.repositorio;

import edu.udea.relaciones.Relaciones.models.Estudiante;
import edu.udea.relaciones.Relaciones.models.Mentor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MentorRepositorio extends JpaRepository <Mentor, Integer> {
}
