package edu.udea.relaciones.Relaciones.controlador;

import edu.udea.relaciones.Relaciones.models.Grupo;
import edu.udea.relaciones.Relaciones.servicio.GrupoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GrupoController {

    @Autowired
    private GrupoService grupoService;

    @GetMapping("/grupos")
    public ResponseEntity<List<Grupo>>getGrupo(){
        return new ResponseEntity<>(grupoService.getGrupo(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/grupo")
    public ResponseEntity<Grupo> setGrupo(@RequestBody Grupo grupo){
        return new ResponseEntity<>(grupoService.save(grupo), HttpStatus.OK);
    }
}
