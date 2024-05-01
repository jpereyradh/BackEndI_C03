package presencial;

public abstract class Contador {

    public String liquidarSueldo(Empleado empleado){
        String resp= "no se pudo liquidar sueldo";
        double sueldo= calcularSueldo(empleado);
        if(sueldo>0){
            String recibo= emitirRecibo(empleado);
            resp= recibo+ " sueldo a liquidar: "+sueldo;
        }
        return  resp;
    }
    public String depositarSueldo(Empleado empleado){
        return "orden de pago al siguiente "+empleado.getNombre()+" cuenta bancaria: "+empleado.getCuentaBancaria();
    }
    public abstract double calcularSueldo(Empleado empleado);
    public abstract String emitirRecibo(Empleado empleado);
}
