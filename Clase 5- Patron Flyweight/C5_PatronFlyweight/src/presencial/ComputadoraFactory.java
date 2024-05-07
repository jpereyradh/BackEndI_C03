package presencial;

import java.util.HashMap;
import java.util.Map;

public class ComputadoraFactory {
    private Map<String,Computadora> computadoraMap;
    private int contador=0;

    public ComputadoraFactory() {
        computadoraMap= new HashMap<>();
    }
    public Computadora getComputadora(int ram, int discoDuro){
        //paso 1 , seria armar la clave
        // paso 2 verificar si existe
        //paso 3 devolver o crear el objeto nuevo
        String key="PC"+ram+discoDuro;
        if(!computadoraMap.containsKey(key)){
            //deberiamos crear
            computadoraMap.put(key,new Computadora(ram,discoDuro));
            System.out.println("Computadora creada con exito");
        }
        contador++;
        System.out.println("Computadoras re utilizadas: "+contador);
        return computadoraMap.get(key);
    }
}
