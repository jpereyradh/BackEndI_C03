package dao;

import model.Medicamento;
import org.apache.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class MedicamentoDAOH2 implements iDao<Medicamento>{
    /*private Integer id;
    private Integer codigo;
    private String nombre;
    private String laboratorio;
    private Integer cantidad;
    private Double precio;*/
    private static final Logger logger= Logger.getLogger(MedicamentoDAOH2.class);
    private static final String SQL_INSERT="INSERT INTO MEDICAMENTOS VALUES(?,?,?,?,?,?)";
    @Override
    public Medicamento guardar(Medicamento medicamento) {
        Connection connection= null;
        try{
            connection= BD.getConnection();
            PreparedStatement psinsert= connection.prepareStatement(SQL_INSERT);
            psinsert.setInt(1,medicamento.getId());
            psinsert.setInt(2,medicamento.getCodigo());
            psinsert.setString(3, medicamento.getNombre());
            psinsert.setString(4, medicamento.getLaboratorio());
            psinsert.setInt(5,medicamento.getCantidad());
            psinsert.setDouble(6,medicamento.getPrecio());
            psinsert.execute();
            logger.info("objeto guardado en la tabla");

        }catch (Exception e){
            logger.warn(e.getMessage());
        }
        return medicamento;
    }
}
