package presencial;

public class Cliente {
    public static void main(String[] args) {
        Tarjeta tarjeta= new Tarjeta(111111,"star bank");
        Producto producto= new Producto("Tomates","latas");
        int cantidad=12;
        FacadeDescuento fachada= new FacadeDescuento();
        System.out.println("Descuento acumulado: "+fachada.descuento(producto,tarjeta,cantidad));
    }
}
