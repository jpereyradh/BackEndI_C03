package MesaTrabajo;

public class ManejadorAceptado extends Manejador{
    @Override
    public void comprobarCalidad(Articulo articulo) {
        System.out.println("producto aceptado");
    }
}
