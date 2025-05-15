package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.EstadoSesion;
import com.example.ProyectoFinal.Model.Sesion;
import com.example.ProyectoFinal.Repository.SesionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SesionService {

    @Autowired
    private SesionRepository sesionRepository;

    public Sesion guardar(Sesion sesion) {
        if (sesion.getEstado() == null) {
            sesion.setEstado(EstadoSesion.COMPLETADA);
        }
        return sesionRepository.save(sesion);
    }

    public List<Sesion> guardarTodos(List<Sesion> sesiones) {
        for (Sesion sesion : sesiones) {
            if (sesion.getEstado() == null) {
                sesion.setEstado(EstadoSesion.COMPLETADA);
            }
        }
        return sesionRepository.saveAll(sesiones);
    }

    public List<Sesion> listar() {
        return sesionRepository.findAll();
    }

    public Sesion actualizar(Long id, Sesion sesionActualizada) {
        if (sesionRepository.existsById(id)) {
            sesionActualizada.setId(id);
            return sesionRepository.save(sesionActualizada);
        }
        return null;
    }
    public void eliminar(Long id) {
        sesionRepository.deleteById(id);
    }

    public Sesion buscarPorId(Long id) {
        return sesionRepository.findById(id).orElse(null);
    }
}
