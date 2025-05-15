package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.PreguntaFormulario;
import com.example.ProyectoFinal.Service.PreguntaFormularioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Preguntas")
public class PreguntaFormularioController {
    @Autowired
    private PreguntaFormularioService preguntaService;

    @PostMapping("/guardar")
    public PreguntaFormulario guardar(@RequestBody PreguntaFormulario pregunta) {
        return preguntaService.guardar(pregunta);
    }

    @PostMapping("/guardar-multiples")
    public List<PreguntaFormulario> guardarMultiples(@RequestBody List<PreguntaFormulario> preguntas) {
        return preguntaService.guardarTodos(preguntas);
    }

    @GetMapping("/listar")
    public List<PreguntaFormulario> listar() {
        return preguntaService.listar();
    }
    @GetMapping("/buscar/{id}")
    public PreguntaFormulario buscarPorId(@PathVariable Long id) {
        return preguntaService.buscarPorId(id);
    }
    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        preguntaService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public PreguntaFormulario actualizar(@PathVariable Long id, @RequestBody PreguntaFormulario actualizado) {
        return preguntaService.actualizar(id, actualizado);
    }
}
