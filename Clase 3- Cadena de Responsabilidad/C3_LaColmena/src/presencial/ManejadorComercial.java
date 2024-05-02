package presencial;

public class ManejadorComercial extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if (mail.getAsunto().equalsIgnoreCase("comercial") || mail.getDestino().equals("comercial@lacolmena.com")) {
            return "El departamento comercial lo atendera en unos minutos.";
        } else {
            System.out.println("No se pudo atender en Comercial, se derivará la consulta");
            return getSiguienteManejador().comprobarMail(mail);
        }
    }
}
