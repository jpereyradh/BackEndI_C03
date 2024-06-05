package com.example.tablaMovimientos.controller;

import com.example.tablaMovimientos.entity.Movimiento;
import com.example.tablaMovimientos.service.MovimientoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/movimientos")
public class MovimientoController {

    @Autowired
     private MovimientoService movimientoService;



    @PostMapping
    public ResponseEntity<Movimiento> guardarMovimiento(@RequestBody Movimiento movimiento){
        return ResponseEntity.ok(movimientoService.guardarMovimiento(movimiento));
    }
    @GetMapping
    public ResponseEntity<List<Movimiento>> listarTodos(){
       return ResponseEntity.ok(movimientoService.listarTodos());
    }
    @PutMapping
    public ResponseEntity<String> actualizarMovimiento(@RequestBody Movimiento movimiento){
        Optional<Movimiento> movimientoBuscado= movimientoService.buscarPorId(movimiento.getId());
        if(movimientoBuscado.isPresent()){
            movimientoService.actualizarMovimiento(movimiento);
            return ResponseEntity.ok("Movimiento actualizado con exito");
        }else{
            return ResponseEntity.badRequest().body("Movimiento no encontrado");
        }
    }
    @GetMapping("/{id}")
    public ResponseEntity<Optional<Movimiento>> buscarPorId(@PathVariable Long id){
       return ResponseEntity.ok(movimientoService.buscarPorId(id));
    }
}
