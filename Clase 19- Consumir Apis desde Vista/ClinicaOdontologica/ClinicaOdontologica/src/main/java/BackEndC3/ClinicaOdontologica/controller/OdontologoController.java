package BackEndC3.ClinicaOdontologica.controller;

import BackEndC3.ClinicaOdontologica.model.Odontologo;
import BackEndC3.ClinicaOdontologica.service.OdontologoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/odontologos")
public class OdontologoController {
    private OdontologoService odontologoService;

    public OdontologoController() {
        odontologoService= new OdontologoService();
    }
    @PostMapping
    public Odontologo guardarOdontologo(@RequestBody Odontologo odontologo){
        return odontologoService.guardarOdontologo(odontologo);
    }
    @GetMapping
    public ResponseEntity<List<Odontologo>> listarTodos(){
        return ResponseEntity.ok(odontologoService.listarTodos());
    }
}
