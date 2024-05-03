package MesaTrabajo;

public class ManjeadorLote extends Manejador{
    @Override
    public void comprobarCalidad(Articulo articulo) {
        if(articulo.getLote()>=1000&&articulo.getLote()<=2000){
            if(getSiguienteManejador()!=null){
                getSiguienteManejador().comprobarCalidad(articulo);
            }
        }
        else{
            System.out.println("fue rechazado por lote");
        }

    }
}
