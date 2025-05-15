package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.PreguntaFormulario;
import com.example.ProyectoFinal.Repository.PreguntaFormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PreguntaFormularioService {

    @Autowired
    private PreguntaFormularioRepository preguntaFormularioRepository;

    public PreguntaFormulario guardar(PreguntaFormulario pregunta) {
        return preguntaFormularioRepository.save(pregunta);
    }

    public List<PreguntaFormulario> guardarTodos(List<PreguntaFormulario> preguntas) {
        return preguntaFormularioRepository.saveAll(preguntas);
    }

    public List<PreguntaFormulario> listar() {
        return preguntaFormularioRepository.findAll();
    }

    public void eliminar(Long id) {
        preguntaFormularioRepository.deleteById(id);
    }

    public PreguntaFormulario actualizar(Long id, PreguntaFormulario actualizado) {
        if (preguntaFormularioRepository.existsById(id)) {
            actualizado.setId(id);
            return preguntaFormularioRepository.save(actualizado);
        }
        return null;
    }

    public PreguntaFormulario buscarPorId(Long id) {
        return preguntaFormularioRepository.findById(id).orElse(null);
    }
}
