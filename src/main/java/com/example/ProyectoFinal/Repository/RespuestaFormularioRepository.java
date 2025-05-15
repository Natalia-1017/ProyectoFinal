package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.RespuestaFormulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RespuestaFormularioRepository extends JpaRepository<RespuestaFormulario, Long> {
}
