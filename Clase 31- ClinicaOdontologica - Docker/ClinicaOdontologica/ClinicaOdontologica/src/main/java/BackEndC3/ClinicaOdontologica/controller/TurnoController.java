package BackEndC3.ClinicaOdontologica.controller;


import BackEndC3.ClinicaOdontologica.dto.TurnoDTO;
import BackEndC3.ClinicaOdontologica.entity.Odontologo;
import BackEndC3.ClinicaOdontologica.entity.Paciente;
import BackEndC3.ClinicaOdontologica.entity.Turno;
import BackEndC3.ClinicaOdontologica.service.OdontologoService;
import BackEndC3.ClinicaOdontologica.service.PacienteService;
import BackEndC3.ClinicaOdontologica.service.TurnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/turnos")
public class TurnoController {
   @Autowired
    private TurnoService turnoService;
   @Autowired
    private PacienteService pacienteService;
   @Autowired
    private OdontologoService odontologoService;


    @PostMapping
    public ResponseEntity<TurnoDTO> guardarTurno(@RequestBody Turno turno){
        Optional<Paciente> pacienteBuscado= pacienteService.buscarPorId(turno.getPaciente().getId());
        Optional<Odontologo> odontologoBuscado= odontologoService.buscarPorId(turno.getOdontologo().getId());

        if(pacienteBuscado.isPresent()&&odontologoBuscado.isPresent()){
            turno.setPaciente(pacienteBuscado.get());
            turno.setOdontologo(odontologoBuscado.get());
            return ResponseEntity.ok(turnoService.registrarTurno(turno));
        }else{
            return ResponseEntity.badRequest().build();
        }

    }
    @GetMapping
    public ResponseEntity<List<TurnoDTO>> buscarTodos(){
        return ResponseEntity.ok(turnoService.listarTodos());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<String> eliminarTurno(@PathVariable Long id){
        Optional<TurnoDTO> turnoBuscado= turnoService.buscarPorId(id);
        if(turnoBuscado.isPresent()){
            turnoService.eliminarTurno(id);
            return ResponseEntity.ok("Turno eliminado con exito");
        }else{
            return ResponseEntity.notFound().build();
        }
    }
}
