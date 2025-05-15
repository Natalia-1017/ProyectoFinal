package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Paciente;
import com.example.ProyectoFinal.Model.Psicologo;
import com.example.ProyectoFinal.Service.PsicologoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Psicologo")
public class PsicologoController {
    @Autowired
    private PsicologoService psicologoService;

    @PostMapping("/guardar")
    public Psicologo guardar(@RequestBody Psicologo psicologo) {
        return psicologoService.guardar(psicologo);
    }

    @PostMapping("/guardar-multiples")
    public List<Psicologo> guardarMultiples(@RequestBody List<Psicologo> psicologos) {
        return psicologoService.guardarTodos(psicologos);
    }

    @GetMapping("/listar")
    public List<Psicologo> listar() {
        return psicologoService.listar();
    }
    @GetMapping("/buscar/{id}")
    public Psicologo buscarPorId(@PathVariable Long id) {
        return psicologoService.buscarPorId(id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        psicologoService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public Psicologo actualizar(@PathVariable Long id, @RequestBody Psicologo actualizado) {
        return psicologoService.actualizar(id, actualizado);
    }
}
