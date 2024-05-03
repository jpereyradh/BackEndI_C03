package MesaTrabajo;

import org.junit.jupiter.api.Test;

public class CompruebaCalidadTest {

    @Test
    public void analistaCalidad(){
        //DADO
        CompruebaCalidad analista= new CompruebaCalidad();
        Articulo articulo= new Articulo("Yerba Mate",122200,1300,"sano");

        //CUANDO
      analista.dispararCadena(articulo);
       /* //ENTONCES
        Assertions.*/
    }
}
