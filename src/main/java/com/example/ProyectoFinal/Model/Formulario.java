package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Formulario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String descripcion;

    @OneToMany(mappedBy = "formulario", cascade = CascadeType.ALL)
    private List<RespuestaFormulario> respuestas;

    public Formulario() {}

    public Formulario(Long id, String titulo, String descripcion, List<RespuestaFormulario> respuestas) {
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.respuestas = respuestas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<RespuestaFormulario> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaFormulario> respuestas) {
        this.respuestas = respuestas;
    }

    @Override
    public String toString() {
        return "Formulario{" +
                "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", respuestas=" + respuestas +
                '}';
    }
}
