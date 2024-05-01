package presencial;

public class EmpleadoContratado extends Empleado {

    private int cantidadHoras;
    private double valorPorHora;

    public EmpleadoContratado(String nombre, String apellido, int cuentaBancaria, int cantidadHoras, double valorPorHora) {
        super(nombre, apellido, cuentaBancaria);
        this.cantidadHoras = cantidadHoras;
        this.valorPorHora = valorPorHora;
    }

    public int getCantidadHoras() {
        return cantidadHoras;
    }

    public double getValorPorHora() {
        return valorPorHora;
    }
}
