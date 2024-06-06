package com.example.directorTecnico.controller;

import com.example.directorTecnico.entity.DirectorTecnico;
import com.example.directorTecnico.service.DirectorTecnicoService;
import jakarta.persistence.criteria.CriteriaBuilder;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("directorTecnico")
public class DirectorTecnicoController {
    @Autowired
    private DirectorTecnicoService directorTecnicoService;

    @PostMapping
    public ResponseEntity<DirectorTecnico> registrarTecnico(@RequestBody DirectorTecnico directorTecnico){
        return ResponseEntity.ok(directorTecnicoService.registrarDT(directorTecnico));
    }
    @GetMapping("buscar/{nombre}")
    public ResponseEntity<Optional<DirectorTecnico>> buscarPorNombre(@PathVariable String nombre){
        Optional<DirectorTecnico> directorTecnicoBuscado= directorTecnicoService.buscarPorNombre(nombre);
        if(directorTecnicoBuscado.isPresent()){
            return ResponseEntity.ok(directorTecnicoBuscado);
        }else{
            return ResponseEntity.badRequest().build();
        }

    }
    @GetMapping("/buscar/mayor/{edad}")
    public ResponseEntity<List<DirectorTecnico>> buscarMayores(@PathVariable Integer edad){
        return ResponseEntity.ok(directorTecnicoService.buscarTecnicoMayorQue(edad));
    }
}
