package presencial;

public class ApiProducto {

    public int descuentoProducto(Producto producto){
        if(producto.getTipo().equalsIgnoreCase("latas")){
            return 10;
        }
        else {
            System.out.println("no aplica descuento por producto");
            return 0;
        }
    }
}
