package presencial;

public class CompruebaMail {
    //el inicio de la cadena---> armar la cadena
    private Manejador inicial;

    public CompruebaMail() {
        //inicialice la las partes de la cadena
        inicial= new ManejadorGerencial();
        Manejador tecnico= new ManejadorTecnico();
        Manejador comercial= new ManejadorComercial();
        Manejador spam= new ManejadorSpam();
        //arme la cadena de manejadores
        inicial.setSiguienteManejador(tecnico);
        tecnico.setSiguienteManejador(comercial);
        comercial.setSiguienteManejador(spam);
    }
    public String disparadorCadena(Mail mail){
        return inicial.comprobarMail(mail);
    }
}
