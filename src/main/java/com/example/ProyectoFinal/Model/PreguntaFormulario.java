package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.util.List;
@Entity
public class PreguntaFormulario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPregunta;

    private String texto;

    @ManyToOne
    @JoinColumn(name = "id_formulario")
    private Formulario formulario;

    public PreguntaFormulario() {
    }

    public PreguntaFormulario(Long idPregunta, String texto, Formulario formulario) {
        this.idPregunta = idPregunta;
        this.texto = texto;
        this.formulario = formulario;
    }

    public Long getIdPregunta() {
        return idPregunta;
    }

    public void setIdPregunta(Long idPregunta) {
        this.idPregunta = idPregunta;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    @Override
    public String toString() {
        return "PreguntaFormulario{" +
                "idPregunta=" + idPregunta +
                ", texto='" + texto + '\'' +
                ", formulario=" + formulario +
                '}';
    }
}
