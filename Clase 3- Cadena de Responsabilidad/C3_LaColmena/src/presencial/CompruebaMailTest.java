package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CompruebaMailTest {

    @Test
    public void mailASpam(){
        //DADO
        CompruebaMail laColmena= new CompruebaMail();
        Mail mail= new Mail("jorge.pereyra@digitalhouse.com","jorgito","backend I");
        String respEsp="movido a spam";
        //CUANDO
        String respActual= laColmena.disparadorCadena(mail);
        //ENTONCES
        Assertions.assertEquals(respEsp,respActual);
    }
}
