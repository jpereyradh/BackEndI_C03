package BackEndC3.ClinicaOdontologica.service;

import BackEndC3.ClinicaOdontologica.dto.TurnoDTO;
import BackEndC3.ClinicaOdontologica.entity.Odontologo;
import BackEndC3.ClinicaOdontologica.entity.Paciente;
import BackEndC3.ClinicaOdontologica.entity.Turno;
import BackEndC3.ClinicaOdontologica.repository.TurnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class TurnoService {
    @Autowired
    private TurnoRepository turnoRepository;

    public TurnoDTO registrarTurno(Turno turno){
        Turno turnoGuardado= turnoRepository.save(turno);
        return turnoAturnoDTO(turnoGuardado);
    }
    public Optional<TurnoDTO> buscarPorId(Long id){
        Optional<Turno> turnoBuscado= turnoRepository.findById(id);
       if(turnoBuscado.isPresent()){
           return Optional.of(turnoAturnoDTO(turnoBuscado.get()));
       }
       else{
           return Optional.empty();
       }
    }
    public void eliminarTurno(Long id){
        turnoRepository.deleteById(id);
    }
    public List<TurnoDTO> listarTodos(){
        List<Turno> listaTurno= turnoRepository.findAll();
        //recorrer la lista
        List<TurnoDTO> listaDTO= new ArrayList<>();
        for (Turno turno : listaTurno) {
            listaDTO.add(turnoAturnoDTO(turno));

        }
        return listaDTO;
    }
    public void actualizarTurno(TurnoDTO turnoDTO){
        turnoRepository.save(turnoDTOaTurno(turnoDTO));
    }
    public TurnoDTO turnoAturnoDTO(Turno turno){
        TurnoDTO turnoDTO= new TurnoDTO();
        turnoDTO.setId(turno.getId());
        turnoDTO.setFecha(turno.getFecha());
        turnoDTO.setPacienteId(turno.getPaciente().getId());
        turnoDTO.setOdontologoId(turno.getOdontologo().getId());

        return turnoDTO;
    }
    public Turno turnoDTOaTurno(TurnoDTO turnoDTO){
        Turno turno= new Turno();
        Odontologo odontologo= new Odontologo();
        Paciente paciente= new Paciente();
        odontologo.setId(turnoDTO.getOdontologoId());
        paciente.setId(turnoDTO.getPacienteId());
        turno.setFecha(turnoDTO.getFecha());
        turno.setId(turnoDTO.getId());
        turno.setOdontologo(odontologo);
        turno.setPaciente(paciente);
        return turno;
    }
}
