package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ContadorTest {

    @Test
    public void liquidarSueldoContratado(){
        //DADO
         Empleado juan= new EmpleadoContratado("Juan","Velasquez",111111,40,8);
         Contador german= new ContadorEmpleadoContratado();
         String respEsp= "La liquidacion es un documento digital sueldo a liquidar: 320.0";
        //CUANDO
        String respActual= german.liquidarSueldo(juan);
        //ENTONCES
        Assertions.assertEquals(respEsp,respActual);
    }
}
