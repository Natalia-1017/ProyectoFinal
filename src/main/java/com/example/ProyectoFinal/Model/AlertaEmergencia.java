package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class AlertaEmergencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAlerta;

    private String mensaje;
    private LocalDateTime fecha;

    @ManyToOne
    @JoinColumn(name = "id_paciente")
    private Paciente paciente;

    @ManyToOne
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;

    @Enumerated(EnumType.STRING)
    private EstadoAlerta estado;

    public AlertaEmergencia() {
    }

    public AlertaEmergencia(Long idAlerta, String mensaje, LocalDateTime fecha, Paciente paciente, Psicologo psicologo, EstadoAlerta estado) {
        this.idAlerta = idAlerta;
        this.mensaje = mensaje;
        this.fecha = fecha;
        this.paciente = paciente;
        this.psicologo = psicologo;
        this.estado = estado;
    }

    public Long getIdAlerta() {
        return idAlerta;
    }

    public void setIdAlerta(Long idAlerta) {
        this.idAlerta = idAlerta;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
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

    public EstadoAlerta getEstado() {
        return estado;
    }

    public void setEstado(EstadoAlerta estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "AlertaEmergencia{" +
                "idAlerta=" + idAlerta +
                ", mensaje='" + mensaje + '\'' +
                ", fecha=" + fecha +
                ", paciente=" + paciente +
                ", psicologo=" + psicologo +
                ", estado=" + estado +
                '}';
    }

    public void setId(Long id) {

    }
}