package edu.udea.relaciones.Relaciones.models;

import javax.persistence.*;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    private int numeroDocumentoEstudiante;
    @Column
    private String nombre;
    @Column
    private String apellidos;

    @Column
    private int nivelActual;

    @OneToOne(mappedBy = "estudiante")
    private Mentor mentor;

    @ManyToOne
    //@JoinColumn(name = "grupo_id", insertable = false, updatable = false)
    private Grupo grupo;

    public Estudiante(int numeroDocumentoEstudiante, String nombre, String apellidos, int nivelActual, Mentor mentor, Grupo grupo) {
        this.numeroDocumentoEstudiante = numeroDocumentoEstudiante;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.nivelActual = nivelActual;
        this.mentor = mentor;
        this.grupo = grupo;
    }

    public Estudiante() {
    }

    public int getNumeroDocumentoEstudiante() {
        return numeroDocumentoEstudiante;
    }

    public void setNumeroDocumentoEstudiante(int numeroDocumentoEstudiante) {
        this.numeroDocumentoEstudiante = numeroDocumentoEstudiante;
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

    public int getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(int nivelActual) {
        this.nivelActual = nivelActual;
    }

    public Mentor getMentor() {
        return mentor;
    }

    public void setMentor(Mentor mentor) {
        this.mentor = mentor;
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void setGrupo(Grupo grupo) {
        this.grupo = grupo;
    }
}
