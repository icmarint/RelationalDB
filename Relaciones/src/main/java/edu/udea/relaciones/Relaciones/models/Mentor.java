package edu.udea.relaciones.Relaciones.models;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;

@Entity
@Table(name="mentor")
public class Mentor {
    @Id
    private int numeroDocumentoMentor;
    @Column
    private String nombre;
    @Column
    private String apellidos;
    @Column
    private int aniosExperiencia;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    @OneToOne
    private Estudiante estudiante;

    public Mentor(int numeroDocumentoMentor, String nombre, String apellidos, int aniosExperiencia, Estudiante estudiante) {
        this.numeroDocumentoMentor = numeroDocumentoMentor;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.aniosExperiencia = aniosExperiencia;
        this.estudiante = estudiante;
    }

    public Mentor() {
    }

    public int getNumeroDocumentoMentor() {
        return numeroDocumentoMentor;
    }

    public void setNumeroDocumentoMentor(int numeroDocumentoMentor) {
        this.numeroDocumentoMentor = numeroDocumentoMentor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getAniosExperiencia() {
        return aniosExperiencia;
    }

    public void setAniosExperiencia(int aniosExperiencia) {
        this.aniosExperiencia = aniosExperiencia;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }
}
