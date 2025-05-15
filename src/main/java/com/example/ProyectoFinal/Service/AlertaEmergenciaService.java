package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.AlertaEmergencia;
import com.example.ProyectoFinal.Repository.AlertaEmergenciaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AlertaEmergenciaService {

    @Autowired
    private AlertaEmergenciaRepository alertaEmergenciaRepository;


    public AlertaEmergencia guardar(AlertaEmergencia alerta) {
        return alertaEmergenciaRepository.save(alerta);
    }

    public List<AlertaEmergencia> guardarTodos(List<AlertaEmergencia> alertas) {
        return alertaEmergenciaRepository.saveAll(alertas);
    }

    public List<AlertaEmergencia> listar() {
        return alertaEmergenciaRepository.findAll();
    }

    public void eliminar(Long id) {
        alertaEmergenciaRepository.deleteById(id);
    }

    public AlertaEmergencia actualizar(Long id, AlertaEmergencia actualizado) {
        if (alertaEmergenciaRepository.existsById(id)) {
            actualizado.setId(id);
            return alertaEmergenciaRepository.save(actualizado);
        }
        return null;
    }

    public AlertaEmergencia buscarPorId(Long id) {
        return alertaEmergenciaRepository.findById(id).orElse(null);
    }
}
