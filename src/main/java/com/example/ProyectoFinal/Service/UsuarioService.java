package com.example.ProyectoFinal.Service;

import com.example.ProyectoFinal.Model.Rol;
import com.example.ProyectoFinal.Model.Usuario;
import com.example.ProyectoFinal.Repository.UsuarioRepository;
import jakarta.persistence.Access;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UsuarioService {
    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario guardar(Usuario usuario) {
        validarRol(usuario);
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> guardarTodos(List<Usuario> usuarios) {
        for (Usuario usuario : usuarios) {
            validarRol(usuario);
        }
        return usuarioRepository.saveAll(usuarios);
    }

    public List<Usuario> listar() {
        return usuarioRepository.findAll();
    }

    public void eliminar(Long id) {
        usuarioRepository.deleteById(id);
    }

    public Usuario actualizar(Long id, Usuario actualizado) {
        if (usuarioRepository.existsById(id)) {
            validarRol(actualizado); // Validar antes de actualizar
            actualizado.setId(id);
            return usuarioRepository.save(actualizado);
        }
        return null;
    }

    private void validarRol(Usuario usuario) {
        if (usuario.getRol() == Rol.PACIENTE && usuario.getPsicologo() != null) {
            throw new IllegalArgumentException("Un paciente no puede ser también psicólogo.");
        }
        if (usuario.getRol() == Rol.PSICOLOGO && usuario.getPaciente() != null) {
            throw new IllegalArgumentException("Un psicólogo no puede ser también paciente.");
        }
        if (usuario.getRol() == Rol.ADMIN && (usuario.getPaciente() != null || usuario.getPsicologo() != null)) {
            throw new IllegalArgumentException("Un administrador no puede ser paciente ni psicólogo.");
        }
    }

    public Usuario buscarPorId(Long id) {
        return usuarioRepository.findById(id).orElse(null);
    }
}