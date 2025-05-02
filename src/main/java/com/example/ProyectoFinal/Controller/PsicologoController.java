package com.example.ProyectoFinal.Controller;

import com.example.ProyectoFinal.Model.Psicologo;
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

    @DeleteMapping("/eliminar/{id}")
    public void eliminar(@PathVariable Long id) {
        psicologoService.eliminar(id);
    }

    @PutMapping("/actualizar/{id}")
    public Psicologo actualizar(@PathVariable Long id, @RequestBody Psicologo actualizado) {
        return psicologoService.actualizar(id, actualizado);
    }
}
