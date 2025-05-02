package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;


@Entity
public class RespuestaFormulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRespuesta;

    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private Formulario formulario;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_pregunta")
    private PreguntaFormulario pregunta;

    public RespuestaFormulario() {
    }

    public RespuestaFormulario(Long idRespuesta, String respuesta, Formulario formulario, Paciente paciente, PreguntaFormulario pregunta) {
        this.idRespuesta = idRespuesta;
        this.respuesta = respuesta;
        this.formulario = formulario;
        this.paciente = paciente;
        this.pregunta = pregunta;
    }

    public Long getIdRespuesta() {
        return idRespuesta;
    }

    public void setIdRespuesta(Long idRespuesta) {
        this.idRespuesta = idRespuesta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public PreguntaFormulario getPregunta() {
        return pregunta;
    }

    public void setPregunta(PreguntaFormulario pregunta) {
        this.pregunta = pregunta;
    }

    @Override
    public String toString() {
        return "RespuestaFormulario{" +
                "idRespuesta=" + idRespuesta +
                ", respuesta='" + respuesta + '\'' +
                ", formulario=" + formulario +
                ", paciente=" + paciente +
                ", pregunta=" + pregunta +
                '}';
    }
}