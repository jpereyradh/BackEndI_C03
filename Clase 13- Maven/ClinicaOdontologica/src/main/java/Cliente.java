import dao.BD;
import model.Domicilio;
import model.Paciente;
import service.PacienteService;

import java.time.LocalDate;

public class Cliente {
    public static void main(String[] args) {
        BD.crearTablas();
        Paciente paciente= new Paciente("Luisa","Toro","111111", LocalDate.of(2024,5,21),new Domicilio("calle falsa",123,"cali","Colombia"));
        PacienteService pacienteService= new PacienteService();
        pacienteService.guardarPaciente(paciente);


        System.out.println("Paciente encontrado: "+pacienteService.buscarPorID(3));
    }
}
