package presencial;

public class ContadorEmpleadoEfectivo extends Contador{
    @Override
    public double calcularSueldo(Empleado empleado) {
        double resp=0;
        if(empleado instanceof EmpleadoEfectivo){
            EmpleadoEfectivo empleadoEfectivo= (EmpleadoEfectivo) empleado;
            resp= (empleadoEfectivo.getSueldoBasico()+empleadoEfectivo.getPremio())-empleadoEfectivo.getDescuento();
        }
        return resp;
    }

    @Override
    public String emitirRecibo(Empleado empleado) {
        return "la liquidacion es un papel";
    }
}
