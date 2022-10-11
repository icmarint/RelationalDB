package edu.udea.relaciones.Relaciones.controlador;

import edu.udea.relaciones.Relaciones.models.Mentor;
import edu.udea.relaciones.Relaciones.servicio.MentorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MentorController {

    @Autowired
    private MentorService mentorService;

    @GetMapping("/mentores")
    public ResponseEntity<List<Mentor>>getMentor(){
        return new ResponseEntity<>(mentorService.getMentor(), HttpStatus.ACCEPTED);
    }

    @PostMapping("/mentor")
    public ResponseEntity<Mentor> setMentor(@RequestBody Mentor mentor){
        return new ResponseEntity<>(mentorService.save(mentor), HttpStatus.OK);
    }
}
