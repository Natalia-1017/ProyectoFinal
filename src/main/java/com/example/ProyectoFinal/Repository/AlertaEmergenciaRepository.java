package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.AlertaEmergencia;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AlertaEmergenciaRepository extends JpaRepository<AlertaEmergencia, Long> {
}
