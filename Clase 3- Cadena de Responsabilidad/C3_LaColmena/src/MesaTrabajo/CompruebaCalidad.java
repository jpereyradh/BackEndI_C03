package MesaTrabajo;

public class CompruebaCalidad {
    Manejador inicial= new ManjeadorLote();

    public CompruebaCalidad() {
        Manejador peso= new ManejadorPeso();
        Manejador envase= new ManejadorEnvase();
        Manejador aceptado= new ManejadorAceptado();

        inicial.setSiguienteManejador(peso);
        peso.setSiguienteManejador(envase);
        envase.setSiguienteManejador(aceptado);
    }
    public void dispararCadena(Articulo articulo){
        inicial.comprobarCalidad(articulo);
    }
}
