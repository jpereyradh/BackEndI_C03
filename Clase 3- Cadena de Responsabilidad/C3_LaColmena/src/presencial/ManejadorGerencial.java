package presencial;

public class ManejadorGerencial extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getAsunto().equalsIgnoreCase("gerencia")||mail.getDestino().equals("gerencia@lacolmena.com")){
            return "El departamento gerencia lo atendera en unos minutos.";
        }else{
            System.out.println("No se pudo atender en Gerencia, se derivará la consulta");
            return getSiguienteManejador().comprobarMail(mail);
        }
    }
}
