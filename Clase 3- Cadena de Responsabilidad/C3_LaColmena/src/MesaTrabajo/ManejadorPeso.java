package MesaTrabajo;

public class ManejadorPeso extends Manejador{
    @Override
    public void comprobarCalidad(Articulo articulo) {
        if(articulo.getPeso()>=1200&& articulo.getPeso()<=1300){
            if(getSiguienteManejador()!=null){
                getSiguienteManejador().comprobarCalidad(articulo);
            }
        }
        else{
            System.out.println("fue rechazado por Peso");
        }

    }
}
