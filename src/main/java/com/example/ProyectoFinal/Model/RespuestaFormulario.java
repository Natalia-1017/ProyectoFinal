package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

@Entity
public class RespuestaFormulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String respuesta;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "formulario_id")
    private Formulario formulario;

    public RespuestaFormulario() {}

    public RespuestaFormulario(Long id, String respuesta, Paciente paciente, Formulario formulario) {
        this.id = id;
        this.respuesta = respuesta;
        this.paciente = paciente;
        this.formulario = formulario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    @Override
    public String toString() {
        return "RespuestaFormulario{" +
                "id=" + id +
                ", respuesta='" + respuesta + '\'' +
                ", paciente=" + paciente +
                ", formulario=" + formulario +
                '}';
    }
}
