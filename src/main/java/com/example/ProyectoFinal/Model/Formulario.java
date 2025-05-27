package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Formulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFormulario;
    private String nombre;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;

    @OneToMany(mappedBy = "formulario")
    private List<PreguntaFormulario> preguntas;

    @OneToMany(mappedBy = "formulario")
    private List<RespuestaFormulario> respuestas;

    public Formulario() {
    }

    public Formulario(Long idFormulario, String nombre, LocalDateTime fecha, Psicologo psicologo, List<PreguntaFormulario> preguntas, List<RespuestaFormulario> respuestas) {
        this.idFormulario = idFormulario;
        this.nombre = nombre;
        this.fecha = fecha;
        this.psicologo = psicologo;
        this.preguntas = preguntas;
        this.respuestas = respuestas;
    }

    public Long getIdFormulario() {
        return idFormulario;
    }

    public void setIdFormulario(Long idFormulario) {
        this.idFormulario = idFormulario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public List<PreguntaFormulario> getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(List<PreguntaFormulario> preguntas) {
        this.preguntas = preguntas;
    }

    public List<RespuestaFormulario> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaFormulario> respuestas) {
        this.respuestas = respuestas;
    }

    public void setId(Long id) {

    }

    @Override
    public String toString() {
        return "Formulario{" +
                "idFormulario=" + idFormulario +
                ", nombre='" + nombre + '\'' +
                ", fecha=" + fecha +
                ", psicologo=" + psicologo +
                ", preguntas=" + preguntas +
                ", respuestas=" + respuestas +
                '}';
    }
}