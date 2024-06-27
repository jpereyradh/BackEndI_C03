package BackEndC3.ClinicaOdontologica.controller;

import BackEndC3.ClinicaOdontologica.entity.Odontologo;
import BackEndC3.ClinicaOdontologica.exception.ResourceNotFoundException;
import BackEndC3.ClinicaOdontologica.service.OdontologoService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/odontologos")
@Tag(name = "Controller de Odontologos", description = "permite registrar, eliminar y listar")
public class OdontologoController {
   @Autowired
    private OdontologoService odontologoService;


    @PostMapping
    @Operation(summary = "nos permite registrar", description = "enviar odontologo sin id")
          @ApiResponse(responseCode = "200", description = "odontologo creado con exito")
        public ResponseEntity<Odontologo> guardarOdontologo(@RequestBody Odontologo odontologo){
        return ResponseEntity.status(200).body(odontologoService.registrarOdontologo(odontologo));
    }
    @GetMapping
    @Parameter(description = "nos permite listar todos los odontologos")
    public ResponseEntity<List<Odontologo>> listarTodos(){
        return ResponseEntity.ok(odontologoService.listarTodos());
    }
    @DeleteMapping
    public ResponseEntity<String> eliminarOdontologo(Long id) throws ResourceNotFoundException {
        Optional<Odontologo> odontologoBuscado= odontologoService.buscarPorId(id);
        if(odontologoBuscado.isPresent()){
            odontologoService.eliminarOdontologo(id);
            return ResponseEntity.ok("odontologo eliminado con exito");
        }else{
            throw  new ResourceNotFoundException("odontologo no encontrado");

        }
    }
}
