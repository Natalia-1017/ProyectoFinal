package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.AlertaEmergencia;
import com.example.ProyectoFinal.Model.Formulario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormularioRepository extends JpaRepository<Formulario, Long> {
}
