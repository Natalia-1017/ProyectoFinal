package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;

import java.util.List;


@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPaciente;

    @OneToOne
    @JoinColumn(name = "id_usuario")
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name = "id_psicologo")
    private Psicologo psicologo;

    @OneToMany(mappedBy = "paciente")
    private List<RespuestaFormulario> respuestas;

    @OneToMany(mappedBy = "paciente")
    private List<Sesion> sesiones;

    @OneToMany(mappedBy = "paciente")
    private List<AlertaEmergencia> alertas;

    @OneToMany(mappedBy = "paciente")
    private List<Diario> diarios;

    public Paciente() {
    }

    public Paciente(Long idPaciente, Usuario usuario, Psicologo psicologo, List<RespuestaFormulario> respuestas, List<Sesion> sesiones, List<AlertaEmergencia> alertas, List<Diario> diarios) {
        this.idPaciente = idPaciente;
        this.usuario = usuario;
        this.psicologo = psicologo;
        this.respuestas = respuestas;
        this.sesiones = sesiones;
        this.alertas = alertas;
        this.diarios = diarios;
    }

    public Long getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(Long idPaciente) {
        this.idPaciente = idPaciente;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Psicologo getPsicologo() {
        return psicologo;
    }

    public void setPsicologo(Psicologo psicologo) {
        this.psicologo = psicologo;
    }

    public List<RespuestaFormulario> getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(List<RespuestaFormulario> respuestas) {
        this.respuestas = respuestas;
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

    public List<Diario> getDiarios() {
        return diarios;
    }

    public void setDiarios(List<Diario> diarios) {
        this.diarios = diarios;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "idPaciente=" + idPaciente +
                ", usuario=" + usuario +
                ", psicologo=" + psicologo +
                ", respuestas=" + respuestas +
                ", sesiones=" + sesiones +
                ", alertas=" + alertas +
                ", diarios=" + diarios +
                '}';
    }

    public void setId(Long id) {

    }
}