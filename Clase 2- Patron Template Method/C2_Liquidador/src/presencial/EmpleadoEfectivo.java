package presencial;

public class EmpleadoEfectivo extends Empleado {
    private double sueldoBasico, premio, descuento;

    public EmpleadoEfectivo(String nombre, String apellido, int cuentaBancaria, double sueldoBasico, double premio, double descuento) {
        super(nombre, apellido, cuentaBancaria);
        this.sueldoBasico = sueldoBasico;
        this.premio = premio;
        this.descuento = descuento;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public double getPremio() {
        return premio;
    }

    public double getDescuento() {
        return descuento;
    }
}
