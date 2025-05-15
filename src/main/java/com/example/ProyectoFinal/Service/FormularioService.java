package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.Formulario;
import com.example.ProyectoFinal.Repository.FormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class FormularioService {

    @Autowired
    private FormularioRepository formularioRepository;

    public Formulario guardar(Formulario formulario) {
        return formularioRepository.save(formulario);
    }

    public List<Formulario> guardarTodos(List<Formulario> formularios) {
        return formularioRepository.saveAll(formularios);
    }

    public List<Formulario> listar() {
        return formularioRepository.findAll();
    }

    public void eliminar(Long id) {
        formularioRepository.deleteById(id);
    }

    public Formulario actualizar(Long id, Formulario actualizado) {
        if (formularioRepository.existsById(id)) {
            actualizado.setId(id);
            return formularioRepository.save(actualizado);
        }
        return null;
    }

    public Formulario buscarPorId(Long id) {
        return formularioRepository.findById(id).orElse(null);
    }
}
