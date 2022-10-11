package edu.udea.relaciones.Relaciones.controlador;

import edu.udea.relaciones.Relaciones.models.Materia;
import edu.udea.relaciones.Relaciones.servicio.MateriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MateriaController {

    @Autowired
    private MateriaService materiaService;

    @GetMapping("/materias")
    public ResponseEntity<List<Materia>>getMateria(){
        return new ResponseEntity<>(materiaService.getMateria(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/materia")
    public ResponseEntity<Materia> setMateria(@RequestBody Materia materia){
        return new ResponseEntity<>(materiaService.save(materia), HttpStatus.OK);
    }
}
