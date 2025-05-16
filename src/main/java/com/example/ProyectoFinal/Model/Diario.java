package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class Diario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate fecha;

    @ManyToOne
    private Paciente paciente;

    @Column(columnDefinition = "TEXT")
    private String entrada;

    public Diario() {
    }

    public Diario(Long id, LocalDate fecha, Paciente paciente, String entrada) {
        this.id = id;
        this.fecha = fecha;
        this.paciente = paciente;
        this.entrada = entrada;
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

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }

    @Override
    public String toString() {
        return "Diario{" +
                "id=" + id +
                ", fecha=" + fecha +
                ", paciente=" + paciente +
                ", entrada='" + entrada + '\'' +
                '}';
    }
}

