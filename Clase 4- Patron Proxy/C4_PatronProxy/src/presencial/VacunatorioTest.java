package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class VacunatorioTest {

    @Test
    public void casoICorrecto(){
        //DADO
        Persona persona= new Persona("astra zeneca",new Date(2024-1900,5,3),111111,"Junior");
        VacunatorioProxy centro= new VacunatorioProxy();
       String respEsp= "vuelva cuando sea su turno.";

        //CUANDO
        String respAc= centro.vacunar(persona);

        //ENTONCES
        Assertions.assertEquals(respAc,respEsp);
    }
    @Test
   public void casocorrecto(){
        Persona persona= new Persona("astra zeneca",new Date(2024-1900,4,2),111111,"Junior Benitez");
        VacunatorioProxy centro= new VacunatorioProxy();
        String respEsp= "finalizado";

        //CUANDO
        String respAc= centro.vacunar(persona);

        //ENTONCES
        Assertions.assertEquals(respAc,respEsp);   }
}
