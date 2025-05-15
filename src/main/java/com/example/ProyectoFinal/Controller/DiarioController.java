package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Diario;
import com.example.ProyectoFinal.Service.DiarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/diario")
public class DiarioController {

    @Autowired
    private DiarioService diarioService;

    @PostMapping("/guardar")
    public Diario guardar(@RequestBody Diario diario) {
        return diarioService.guardar(diario);
    }

    @PostMapping("/guardar-multiples")
    public List<Diario> guardarMultiples(@RequestBody List<Diario> diarios) {
        return diarioService.guardarTodos(diarios);
    }

    @GetMapping("/listar")
    public List<Diario> listar() {
        return diarioService.listar();
    }

    @GetMapping("/buscar/{id}")
    public Diario buscarPorId(@PathVariable Long id) {
        return diarioService.buscarPorId(id);
    }

    @PutMapping("/actualizar/{id}")
    public Diario actualizar(@PathVariable Long id, @RequestBody Diario actualizado) {
        return diarioService.actualizar(id, actualizado);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        diarioService.eliminar(id);
    }
}
