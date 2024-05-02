package presencial;

public class ManejadorSpam extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        System.out.println("finalmente no se pudo procesar la solicitud");
        return "movido a spam";
    }
}
