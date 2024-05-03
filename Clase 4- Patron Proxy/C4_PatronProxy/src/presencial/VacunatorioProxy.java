package presencial;

import java.util.Date;

public class VacunatorioProxy implements VacunatorioService{

    //hacer una relacion de asociacion con el vacuntario
    private Vacunatorio centroVacunatorio;

    public VacunatorioProxy() {
        centroVacunatorio= new Vacunatorio();
    }

    @Override
    public String vacunar(Persona persona) {
        //filtrar y verificar
        Date hoy= new Date();
        System.out.println("La fecha de hoy es : "+hoy);
        if(hoy.before(persona.getFechavacuna())){
            //no se puede vacunar
            return "vuelva cuando sea su turno";
        }else{
            return centroVacunatorio.vacunar(persona);
        }

    }
}
