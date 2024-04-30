package presencial;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
    private List<Persona> listaPersona;

    public Grupo() {
        listaPersona= new ArrayList<>();
    }

    public List<Persona> getListaPersona() {
        return listaPersona;
    }

    public void agregarPersona(Persona persona){
        if(persona.checkEdad()&& persona.checkAZ()&& persona.cantidadDeLetras()&& persona.esMayorEdad()){
            listaPersona.add(persona);
        }else{
            System.out.println("No se pudo agregar a : "+persona.getNombre());
        }
    }
}
