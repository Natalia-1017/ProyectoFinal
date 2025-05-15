package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.Psicologo;
import com.example.ProyectoFinal.Repository.PsicologoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PsicologoService {

    @Autowired
    private PsicologoRepository psicologoRepository;

    public Psicologo guardar(Psicologo psicologo) {
        return psicologoRepository.save(psicologo);
    }

    public List<Psicologo> guardarTodos(List<Psicologo> psicologos) {
        return psicologoRepository.saveAll(psicologos);
    }

    public List<Psicologo> listar() {
        return psicologoRepository.findAll();
    }

    public void eliminar(Long id) {
        psicologoRepository.deleteById(id);
    }

    public Psicologo actualizar(Long id, Psicologo actualizado) {
        if (psicologoRepository.existsById(id)) {
            actualizado.setId(id);
            return psicologoRepository.save(actualizado);
        }
        return null;
    }

    public Psicologo buscarPorId(Long id) {
        return psicologoRepository.findById(id).orElse(null);
    }
}
