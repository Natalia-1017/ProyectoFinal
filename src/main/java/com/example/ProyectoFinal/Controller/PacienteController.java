package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Paciente;
import com.example.ProyectoFinal.Service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Paciente")
public class PacienteController {
    @Autowired
    private PacienteService pacienteService;

    @PostMapping("/guardar")
    public Paciente guardar(@RequestBody Paciente paciente) {
        return pacienteService.guardar(paciente);
    }

    @PostMapping("/guardar-multiples")
    public List<Paciente> guardarMultiples(@RequestBody List<Paciente> pacientes) {
        return pacienteService.guardarTodos(pacientes);
    }

    @GetMapping("/listar")
    public List<Paciente> listar() {
        return pacienteService.listar();
    }
    @GetMapping("/buscar/{id}")
    public Paciente buscarPorId(@PathVariable Long id) {
        return pacienteService.buscarPorId(id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        pacienteService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public Paciente actualizar(@PathVariable Long id, @RequestBody Paciente actualizado) {
        return pacienteService.actualizar(id, actualizado);
    }
}
