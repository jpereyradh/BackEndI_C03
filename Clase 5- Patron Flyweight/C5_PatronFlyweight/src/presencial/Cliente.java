package presencial;


public class Cliente {
    public static void main(String[] args) {
      ComputadoraFactory fabricaPC= new ComputadoraFactory();
      Computadora pc0= fabricaPC.getComputadora(2,128);
        Computadora pc1= fabricaPC.getComputadora(2,128);
        Computadora pc2= fabricaPC.getComputadora(2,128);
        Computadora pc3= fabricaPC.getComputadora(2,128);
        Computadora pc4= fabricaPC.getComputadora(2,128);
        Computadora pc5= fabricaPC.getComputadora(2,128);
        Computadora pc6= fabricaPC.getComputadora(16,500);
        Computadora pc7= fabricaPC.getComputadora(16,500);
        Computadora pc8= fabricaPC.getComputadora(16,500);
        Computadora pc9= fabricaPC.getComputadora(16,500);

        System.out.println("Computadoras creadas: "+Computadora.getContador());

    }
}
