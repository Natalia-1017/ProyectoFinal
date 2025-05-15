package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Formulario;
import com.example.ProyectoFinal.Service.FormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Formulario")
public class FormularioController {
    @Autowired
    private FormularioService formularioService;

    @PostMapping("/guardar")
    public Formulario guardar(@RequestBody Formulario formulario) {
        return formularioService.guardar(formulario);
    }

    @PostMapping("/guardar-multiples")
    public List<Formulario> guardarMultiples(@RequestBody List<Formulario> formularios) {
        return formularioService.guardarTodos(formularios);
    }

    @GetMapping("/listar")
    public List<Formulario> listar() {
        return formularioService.listar();
    }
    @GetMapping("/buscar/{id}")
    public Formulario buscarPorId(@PathVariable Long id) {
        return formularioService.buscarPorId(id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        formularioService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public Formulario actualizar(@PathVariable Long id, @RequestBody Formulario actualizado) {
        return formularioService.actualizar(id, actualizado);
    }
}
