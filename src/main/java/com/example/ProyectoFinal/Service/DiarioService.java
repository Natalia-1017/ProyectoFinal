package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.Diario;
import com.example.ProyectoFinal.Repository.DiarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DiarioService {
    @Autowired
    private DiarioRepository diarioRepository;

    public Diario guardar(Diario diario) {
        return diarioRepository.save(diario);
    }

    public List<Diario> guardarTodos(List<Diario> diarios) {
        return diarioRepository.saveAll(diarios);
    }

    public List<Diario> listar() {
        return diarioRepository.findAll();
    }

    public Diario buscarPorId(Long id) {
        return diarioRepository.findById(id).orElse(null);
    }

    public Diario actualizar(Long id, Diario actualizado) {
        if (diarioRepository.existsById(id)) {
            actualizado.setId(id);
            return diarioRepository.save(actualizado);
        }
        return null;
    }

    public void eliminar(Long id) {
        diarioRepository.deleteById(id);
    }
}