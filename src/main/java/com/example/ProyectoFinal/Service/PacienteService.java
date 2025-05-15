package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.Paciente;
import com.example.ProyectoFinal.Repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PacienteService {

    @Autowired
    private PacienteRepository pacienteRepository;

    public Paciente guardar(Paciente paciente) {
        return pacienteRepository.save(paciente);
    }

    public List<Paciente> guardarTodos(List<Paciente> pacientes) {
        return pacienteRepository.saveAll(pacientes);
    }

    public List<Paciente> listar() {
        return pacienteRepository.findAll();
    }

    public void eliminar(Long id) {
        pacienteRepository.deleteById(id);
    }

    public Paciente actualizar(Long id, Paciente actualizado) {
        if (pacienteRepository.existsById(id)) {
            actualizado.setId(id);
            return pacienteRepository.save(actualizado);
        }
        return null;
    }

    public Paciente buscarPorId(Long id) {
        return pacienteRepository.findById(id).orElse(null);
    }
}
