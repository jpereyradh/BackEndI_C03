import org.apache.log4j.Logger;

import java.sql.*;

public class Cliente {
    // aca debemos poner atributos y  sql
    private static final String SQL_DROP_CREATE=" DROP TABLE IF EXISTS CUENTAS; " +
            "CREATE TABLE CUENTAS (ID INT PRIMARY KEY, NOMBRE VARCHAR(100) NOT NULL, NUMERO_CUENTA INT NOT NULL, SALDO NUMERIC(10,2) NOT NULL)";
    //EJ DE NUMERIC(10,2)= 87654321,22 8ENT, 2DEC
    private static final String SQL_INSERT="INSERT INTO CUENTAS VALUES(?,?,?,?)";
    private static final String SQL_UPDATE="UPDATE CUENTAS SET SALDO=? WHERE ID=?";
    private static final Logger logger= Logger.getLogger(Cliente.class);
    public static void main(String[] args) {
        Connection connection=null;
        try{
            connection= getConnection();
              //crear la tabla
            Statement statement= connection.createStatement();
            statement.execute(SQL_DROP_CREATE);
            logger.info("tablas creadas con exito");
            PreparedStatement psInsert= connection.prepareStatement(SQL_INSERT);
            //ahora tengo que cargar las parametrizadas
            psInsert.setInt(1,1);
            psInsert.setString(2,"Gina Arias");
            psInsert.setInt(3,111111);
            psInsert.setDouble(4,200);
            psInsert.execute();
            logger.info("datos cargados con exito");

            PreparedStatement psUpdate= connection.prepareStatement(SQL_UPDATE);
            psUpdate.setDouble(1,200+10);
            psUpdate.setInt(2,1);
            psUpdate.execute(); //aca vuelve el rollback
            logger.info("datos actualizados con exito");
            connection.setAutoCommit(false);
            PreparedStatement psUpdateTX= connection.prepareStatement(SQL_UPDATE);
            psUpdateTX.setDouble(1,200+10+15);
            psUpdateTX.setInt(2,1);
            psUpdateTX.execute();
            logger.info("hasta aca llego?");
            int x=4/0;
            connection.commit();//<--- quiero confirmar efectivamente los cambios de la linea 40
            connection.setAutoCommit(true); //<-- siempre es bueno dejar en true
            logger.info("datos actualizados con exito");
        }catch (Exception e){
            try {
                connection.rollback();
                logger.warn("volvimos a la linea 33");
            }catch (SQLException ex){
                logger.warn(ex.getMessage());
            }

        }

    }
    public static Connection getConnection() throws Exception{
        Class.forName("org.h2.Driver");
        return DriverManager.getConnection("jdbc:h2:~/C9_Consultas","sa","sa");
    }

}
