package presencial;

public class ManejadorTecnico extends Manejador{
    @Override
    public String comprobarMail(Mail mail) {
        if(mail.getAsunto().equalsIgnoreCase("tecnico")||mail.getDestino().equals("tecnico@lacolmena.com")){
            return "El departamento tecnico lo atendera en unos minutos.";
        }else{
            System.out.println("No se pudo atender en Tecnica, se derivará la consulta");
            return getSiguienteManejador().comprobarMail(mail);
        }

    }
}
