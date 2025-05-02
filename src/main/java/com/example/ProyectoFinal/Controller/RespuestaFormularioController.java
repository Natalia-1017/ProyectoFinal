package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.RespuestaFormulario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/Respuestas")
public class RespuestaFormularioController {

    @Autowired
    private RespuestaFormularioService respuestaService;

    @PostMapping("/guardar")
    public RespuestaFormulario guardar(@RequestBody RespuestaFormulario respuesta) {
        return respuestaService.guardar(respuesta);
    }

    @PostMapping("/guardar-multiples")
    public List<RespuestaFormulario> guardarMultiples(@RequestBody List<RespuestaFormulario> respuestas) {
        return respuestaService.guardarTodos(respuestas);
    }

    @GetMapping("/listar")
    public List<RespuestaFormulario> listar() {
        return respuestaService.listar();
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        respuestaService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public RespuestaFormulario actualizar(@PathVariable Long id, @RequestBody RespuestaFormulario actualizado) {
        return respuestaService.actualizar(id, actualizado);
    }
}
