package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.RespuestaFormulario;
import com.example.ProyectoFinal.Repository.RespuestaFormularioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RespuestaFormularioService {

    @Autowired
    private RespuestaFormularioRepository respuestaFormularioRepository;

    public RespuestaFormulario guardar(RespuestaFormulario respuesta) {
        return respuestaFormularioRepository.save(respuesta);
    }

    public List<RespuestaFormulario> guardarTodos(List<RespuestaFormulario> respuestas) {
        return respuestaFormularioRepository.saveAll(respuestas);
    }

    public List<RespuestaFormulario> listar() {
        return respuestaFormularioRepository.findAll();
    }

    public void eliminar(Long id) {
        respuestaFormularioRepository.deleteById(id);
    }

    public RespuestaFormulario actualizar(Long id, RespuestaFormulario actualizado) {
        if (respuestaFormularioRepository.existsById(id)) {
            actualizado.setId(id);
            return respuestaFormularioRepository.save(actualizado);
        }
        return null;
    }

    public RespuestaFormulario buscarPorId(Long id) {
        return respuestaFormularioRepository.findById(id).orElse(null);
    }
}
