package presencial;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Vacunatorio implements VacunatorioService{
    @Override
    public String vacunar(Persona persona) {
        System.out.println("****** verificando datos del paciente **********");
        System.out.println("Paciente vacunado satisfactoriamente");
        System.out.println("Datos del paciente: ");
        System.out.println(persona.getCedula());
        System.out.println(persona.getNombre());
        System.out.println("Vacuna colocada: "+persona.getNombreVacuna());
       ;
        return "finalizado";
    }

}
