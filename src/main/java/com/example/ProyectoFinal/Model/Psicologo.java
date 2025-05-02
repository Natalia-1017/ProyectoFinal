package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Psicologo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPsicologo;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @OneToMany(mappedBy = "psicologo")
    private List<Paciente> pacientes;

    @OneToMany(mappedBy = "psicologo")
    private List<Formulario> formularios;

    @OneToMany(mappedBy = "psicologo")
    private List<Sesion> sesiones;

    @OneToMany(mappedBy = "psicologo")
    private List<AlertaEmergencia> alertas;

    public Psicologo() {
    }

    public Psicologo(Long idPsicologo, Usuario usuario, List<Paciente> pacientes, List<Formulario> formularios, List<Sesion> sesiones, List<AlertaEmergencia> alertas) {
        this.idPsicologo = idPsicologo;
        this.usuario = usuario;
        this.pacientes = pacientes;
        this.formularios = formularios;
        this.sesiones = sesiones;
        this.alertas = alertas;
    }

    public Long getIdPsicologo() {
        return idPsicologo;
    }

    public void setIdPsicologo(Long idPsicologo) {
        this.idPsicologo = idPsicologo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    public List<Formulario> getFormularios() {
        return formularios;
    }

    public void setFormularios(List<Formulario> formularios) {
        this.formularios = formularios;
    }

    public List<Sesion> getSesiones() {
        return sesiones;
    }

    public void setSesiones(List<Sesion> sesiones) {
        this.sesiones = sesiones;
    }

    public List<AlertaEmergencia> getAlertas() {
        return alertas;
    }

    public void setAlertas(List<AlertaEmergencia> alertas) {
        this.alertas = alertas;
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "idPsicologo=" + idPsicologo +
                ", usuario=" + usuario +
                ", pacientes=" + pacientes +
                ", formularios=" + formularios +
                ", sesiones=" + sesiones +
                ", alertas=" + alertas +
                '}';
    }
}