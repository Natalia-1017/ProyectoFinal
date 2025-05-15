package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Sesion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSesion;

    private LocalDateTime fecha;
    private String notas;

    @Enumerated(EnumType.STRING)
    private EstadoSesion estado;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;

    public Sesion() {
    }

    public Sesion(Long idSesion, LocalDateTime fecha, String notas, EstadoSesion estado, Paciente paciente, Psicologo psicologo) {
        this.idSesion = idSesion;
        this.fecha = fecha;
        this.notas = notas;
        this.estado = estado;
        this.paciente = paciente;
        this.psicologo = psicologo;
    }

    public Long getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(Long idSesion) {
        this.idSesion = idSesion;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNotas() {
        return notas;
    }

    public void setNotas(String notas) {
        this.notas = notas;
    }

    public EstadoSesion getEstado() {
        return estado;
    }

    public void setEstado(EstadoSesion estado) {
        this.estado = estado;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    @Override
    public String toString() {
        return "Sesion{" +
                "idSesion=" + idSesion +
                ", fecha=" + fecha +
                ", notas='" + notas + '\'' +
                ", estado=" + estado +
                ", paciente=" + paciente +
                ", psicologo=" + psicologo +
                '}';
    }

    public void setId(Long id) {

    }
}