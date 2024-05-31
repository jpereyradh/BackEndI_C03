package BackEndC3.ClinicaOdontologica.service;

import BackEndC3.ClinicaOdontologica.dao.OdontologoDAOH2;
import BackEndC3.ClinicaOdontologica.dao.iDao;
import BackEndC3.ClinicaOdontologica.model.Odontologo;

import java.util.List;

public class OdontologoService {
    private iDao<Odontologo> odontologoiDao;

    public OdontologoService() {
        odontologoiDao= new OdontologoDAOH2();
    }
    //aca debemos poner todos los metodos manuales
    public  Odontologo guardarOdontologo(Odontologo odontologo){
        return odontologoiDao.guardar(odontologo);
    }
    public Odontologo buscarPorId(Integer id){
        return odontologoiDao.buscarPorId(id);
    }
    public List<Odontologo>listarTodos(){
        return odontologoiDao.buscarTodos();
    }
}
