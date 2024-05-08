package presencial;

public class FacadeDescuento implements iFacadeDescuento{
    //¿como hago para que la fachada interactue con los subsistemas?
    private ApiCantidad apiCantidad;
    private ApiProducto apiProducto;
    private ApiTarjeta apiTarjeta;

    public FacadeDescuento() {
        apiTarjeta= new ApiTarjeta();
        apiProducto= new ApiProducto();
        apiCantidad=new ApiCantidad();
    }

    @Override
    public int descuento(Producto producto, Tarjeta tarjeta, int cantidad) {
        int descuento= 0;
        descuento= descuento+ apiCantidad.descuentoCant(cantidad);
        descuento=descuento+apiProducto.descuentoProducto(producto);
        descuento= descuento+apiTarjeta.descuentoTarjeta(tarjeta);
        return descuento;
    }
}
