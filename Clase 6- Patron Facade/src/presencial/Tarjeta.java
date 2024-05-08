package presencial;

public class Tarjeta {
    private int numero;
    private String nombre;

    public Tarjeta(int numero, String nombre) {
        this.numero = numero;
        this.nombre = nombre;
    }

    public int getNumero() {
        return numero;
    }

    public String getNombre() {
        return nombre;
    }
}
