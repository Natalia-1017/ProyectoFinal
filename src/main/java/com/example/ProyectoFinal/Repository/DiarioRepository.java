package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.AlertaEmergencia;
import com.example.ProyectoFinal.Model.Diario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DiarioRepository  extends JpaRepository<Diario, Long> {
}
