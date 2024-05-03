package MesaTrabajo;

public class Articulo {
    private String nombre;
    private int lote, peso;
    private String envase;

    public Articulo(String nombre, int lote, int peso, String envase) {
        this.nombre = nombre;
        this.lote = lote;
        this.peso = peso;
        this.envase = envase;
    }

    public String getNombre() {
        return nombre;
    }

    public int getLote() {
        return lote;
    }

    public int getPeso() {
        return peso;
    }

    public String getEnvase() {
        return envase;
    }
}
