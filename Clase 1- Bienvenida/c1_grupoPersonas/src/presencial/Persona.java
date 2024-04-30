package presencial;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    public boolean esMayorEdad(){
        return edad>=18; //por default va a devolver true
    }
    public boolean checkEdad(){
        boolean resp= false;
        if(edad>0&&edad<=120){
            resp=true;
        }
        return resp;
        //return edad>=18&&edad<=120;
    }
    public boolean cantidadDeLetras(){
        return nombre.length()>4;
    }
    public boolean checkAZ(){
        boolean resp=false;
        char[] array= nombre.toCharArray();
        for (char letra : array) {
            if(!Character.isLetter(letra)){
                return resp;
            }
        }
        resp=true;
        return resp;
    }

    public String getNombre() {
        return nombre;
    }
}
