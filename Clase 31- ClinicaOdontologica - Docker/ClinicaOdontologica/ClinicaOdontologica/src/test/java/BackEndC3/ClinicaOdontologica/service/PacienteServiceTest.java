package BackEndC3.ClinicaOdontologica.service;

import BackEndC3.ClinicaOdontologica.entity.Domicilio;
import BackEndC3.ClinicaOdontologica.entity.Paciente;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class PacienteServiceTest {
    @Autowired
    private PacienteService pacienteService;

    @Test
    @Order(1)
    public void guardarPaciente(){
        Paciente paciente= new Paciente("Jorgito","pereyra","11111", LocalDate.of(2024,6,20),new Domicilio("calle falsa",123,"La Rioja","Argentina"),"jorge.pereyra@digitalhouse.com");
        Paciente pacienteGuardado= pacienteService.guardarPaciente(paciente);
        assertEquals(1L,pacienteGuardado.getId());
    }

    @Test
    @Order(2)
    public void buscarPacientePorId(){
        Long id= 1L;
        Optional<Paciente> pacienteBuscado= pacienteService.buscarPorId(id);
        assertNotNull(pacienteBuscado.get());
    }

    @Test
    @Order(3)
    public void actualizarPaciente(){
        Long id= 1L;
        Paciente paciente= new Paciente(id,"German","Fraire","11111", LocalDate.of(2024,6,20),new Domicilio("calle falsa",123,"La Rioja","Argentina"),"jorge.pereyra@digitalhouse.com");
        pacienteService.actualizarPaciente(paciente);
        Optional<Paciente> pacienteBuscado= pacienteService.buscarPorId(id);
        assertEquals("German", pacienteBuscado.get().getNombre());
            }

   @Test
   @Order(4)
   public void ListarTodos(){
        List<Paciente> listaPacientes= pacienteService.listarTodos();
        assertEquals(1,listaPacientes.size());
   }
   @Test
    @Order(5)
    public void eliminarPaciente(){
        pacienteService.eliminarPaciente(1L);
        Optional<Paciente> pacienteEliminado= pacienteService.buscarPorId(1L);
        assertFalse(pacienteEliminado.isPresent());
   }
}
