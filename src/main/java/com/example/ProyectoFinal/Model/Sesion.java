package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.time.LocalDate;

@Entity
public class Sesion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;
    private String observaciones;

    @ManyToOne
    @JoinColumn(name = "paciente_id")
    private Paciente paciente;

    public Sesion() {}

    public Sesion(Long id, LocalDate fecha, String observaciones, Paciente paciente) {
        this.id = id;
        this.fecha = fecha;
        this.observaciones = observaciones;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", observaciones='" + observaciones + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}
