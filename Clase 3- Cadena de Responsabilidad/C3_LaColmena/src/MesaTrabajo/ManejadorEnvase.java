package MesaTrabajo;

public class ManejadorEnvase extends Manejador{
    @Override
    public void comprobarCalidad(Articulo articulo) {
        if(articulo.getEnvase().equals("sano")||articulo.getEnvase().equalsIgnoreCase("casi sano")){
            if(getSiguienteManejador()!=null){
                getSiguienteManejador().comprobarCalidad(articulo);
            }
        }
        else{
            System.out.println("fue rechazado por Envase");
        }

    }
}
