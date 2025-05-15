package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.PreguntaFormulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PreguntaFormularioRepository extends JpaRepository<PreguntaFormulario, Long> {
}
