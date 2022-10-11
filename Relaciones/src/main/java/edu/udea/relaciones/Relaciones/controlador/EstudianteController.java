package edu.udea.relaciones.Relaciones.controlador;

import edu.udea.relaciones.Relaciones.models.Estudiante;
import edu.udea.relaciones.Relaciones.servicio.EstudianteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EstudianteController {

    @Autowired
    private EstudianteService estudianteService;

    @GetMapping("/estudiantes")
    public ResponseEntity<List<Estudiante>>getEstudiantes(){
        return new ResponseEntity<>(estudianteService.getEstudiante(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/estudiante")
    public ResponseEntity<Estudiante> setEstudiante(@RequestBody Estudiante estudiante){
        return new ResponseEntity<>(estudianteService.save(estudiante), HttpStatus.OK);
    }

    @GetMapping("/estudiante/{idMentor}/mentor")
    public ResponseEntity<Estudiante> getEstudiante(@PathVariable Integer idMentor){
        return new ResponseEntity<>(
                estudianteService.getEstudiante(idMentor),
                HttpStatus.OK
        );
    }

    @GetMapping("/estudiante/{codigoGrupo}/grupo")
    public ResponseEntity<List<Estudiante>> getEstudiantes(@PathVariable String codigoGrupo){
        return new ResponseEntity<>(
                estudianteService.getEstudiantes(codigoGrupo),
                HttpStatus.OK
        );
    }
}
