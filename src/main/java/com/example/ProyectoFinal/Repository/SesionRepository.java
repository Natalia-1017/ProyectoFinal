package com.example.ProyectoFinal.Repository;

import com.example.ProyectoFinal.Model.Sesion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SesionRepository extends JpaRepository<Sesion, Long> {
}
