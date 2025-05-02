package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.AlertaEmergencia;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

public class AlertaEmergenciaController {

    @Autowired
    private AlertaEmergenciaService alertaService;

    @PostMapping("/guardar")
    public AlertaEmergencia guardar(@RequestBody AlertaEmergencia alerta) {
        return alertaService.guardar(alerta);
    }

    @PostMapping("/guardar-multiples")
    public List<AlertaEmergencia> guardarMultiples(@RequestBody List<AlertaEmergencia> alertas) {
        return alertaService.guardarTodos(alertas);
    }

    @GetMapping("/listar")
    public List<AlertaEmergencia> listar() {
        return alertaService.listar();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        alertaService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public AlertaEmergencia actualizar(@PathVariable Long id, @RequestBody AlertaEmergencia actualizado) {
        return alertaService.actualizar(id, actualizado);
    }
}
