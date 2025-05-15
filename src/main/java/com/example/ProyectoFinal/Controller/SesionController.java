package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Sesion;
import com.example.ProyectoFinal.Service.SesionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/Sesion")
public class SesionController {
    @Autowired
    private SesionService sesionService;

    @PostMapping("/guardar")
    public Sesion guardar(@RequestBody Sesion sesion) {
        return sesionService.guardar(sesion);
    }
    @PostMapping("/guardar-multiples")
    public List<Sesion> guardarMultiples(@RequestBody List<Sesion> sesiones) {
        return sesionService.guardarTodos(sesiones);
    }

    @GetMapping("/listar")
    public List<Sesion> listar() {
        return sesionService.listar();
    }
    @GetMapping("/buscar/{id}")
    public Sesion buscarPorId(@PathVariable Long id) {
        return sesionService.buscarPorId(id);
    }
    @PutMapping("/actualizar/{id}")
    public Sesion actualizar(@PathVariable Long id, @RequestBody Sesion sesionActualizada) {
        return sesionService.actualizar(id, sesionActualizada);
    }

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        sesionService.eliminar(id);
    }

}
