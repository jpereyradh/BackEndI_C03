package presencial;

public class ApiCantidad {

    public int descuentoCant(int cantidad){
        if(cantidad<11){
            System.out.println("no aplica descuento por cantidad");
            return 0;

        }

        return 15;
    }
}
