package presencial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class GrupoTest {

    @Test
    public void agregar2Persona(){
        //DADO
        Persona persona1= new Persona("juan",18);
        Persona persona2= new Persona("Pedro",27);
        Persona persona3= new Persona("Ana",22);
        Persona persona4= new Persona("Luz",14);
        Persona persona5= new Persona("julian",32);
        Grupo grupo= new Grupo();
        //CUANDO
        grupo.agregarPersona(persona1);
        grupo.agregarPersona(persona2);
        grupo.agregarPersona(persona3);
        grupo.agregarPersona(persona4);
        grupo.agregarPersona(persona5);
        //ENTONCES
        Assertions.assertTrue(grupo.getListaPersona().size()==2);
    }
}
