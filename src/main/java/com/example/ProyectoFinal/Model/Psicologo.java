package com.example.ProyectoFinal.Model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Psicologo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String correo;
    private String especialidad;

    @OneToMany(mappedBy = "psicologo")
    private List<Paciente> pacientes;

    public Psicologo() {}

    public Psicologo(Long id, String nombre, String correo, String especialidad, List<Paciente> pacientes) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.especialidad = especialidad;
        this.pacientes = pacientes;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public List<Paciente> getPacientes() {
        return pacientes;
    }

    public void setPacientes(List<Paciente> pacientes) {
        this.pacientes = pacientes;
    }

    @Override
    public String toString() {
        return "Psicologo{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", correo='" + correo + '\'' +
                ", especialidad='" + especialidad + '\'' +
                ", pacientes=" + pacientes +
                '}';
    }
}
