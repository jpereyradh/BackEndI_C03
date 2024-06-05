package com.example.tablaProfesor.controller;

import com.example.tablaProfesor.entity.Profesor;
import com.example.tablaProfesor.service.ProfesorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/profesores")
public class ProfesorController {
    @Autowired
    private ProfesorService profesorService;

    @PostMapping
    public ResponseEntity<Profesor> guardarProfesor(@RequestBody Profesor profesor){
        return ResponseEntity.ok(profesorService.guardarProfesor(profesor));
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarProfesor(@PathVariable Long id){
        Optional<Profesor> profesorBuscado= profesorService.buscarPorId(id);
        if(profesorBuscado.isPresent()){
            profesorService.eliminarProfesor(id);
            return ResponseEntity.ok("profesor eliminado con exito");
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
}
