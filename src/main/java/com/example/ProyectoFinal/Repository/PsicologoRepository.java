package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.Psicologo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PsicologoRepository extends JpaRepository<Psicologo, Long> {
}
