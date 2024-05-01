package presencial;

public class ContadorEmpleadoContratado extends Contador{
    @Override
    public double calcularSueldo(Empleado empleado) {
        double resp=0;
        if(empleado instanceof EmpleadoContratado) {
            EmpleadoContratado empleadoContratado = (EmpleadoContratado) empleado;
            resp= empleadoContratado.getCantidadHoras()*empleadoContratado.getValorPorHora();
        }

        return resp;
    }

    @Override
    public String emitirRecibo(Empleado empleado) {
        return "La liquidacion es un documento digital";
    }
}
