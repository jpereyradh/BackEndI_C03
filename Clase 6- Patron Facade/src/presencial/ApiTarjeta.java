package presencial;

public class ApiTarjeta {
    public int descuentoTarjeta(Tarjeta tarjeta){
        if(tarjeta.getNombre().equalsIgnoreCase("star bank")){
            return 20;
        }else{
            System.out.println("no aplica descuento por tarjeta");
            return 0;
        }
    }
}
