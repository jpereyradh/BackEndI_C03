package presencial;

import org.apache.log4j.Logger;

import java.sql.*;

public class Cliente {
    private static final Logger logger= Logger.getLogger(Cliente.class);
    public static void main(String[] args) {
            Connection connection= null; //creando el objeto e inicializarlo en null
            try{
                connection=getConnection(); //devuelve la conexion
                //insertar 5 animales
                Statement statement= connection.createStatement(); //nos va a permitir poder comunicarnos con la bdd atraves del objeto statement
                statement.execute("DROP TABLE IF EXISTS ANIMALES; CREATE TABLE ANIMALES " +
                        " (ID INT PRIMARY KEY, NOMBRE VARCHAR(20) NOT NULL, TIPO VARCHAR(20) NOT NULL)");
                logger.info("se creo correctamente la tabla en la bdd");
                //AHORA INSERTAMOS
                statement.execute("INSERT INTO ANIMALES VALUES (1,'Angie','Delfin'),(2,'Lucas','Rana'),(3,'Sabiola','Conejo'),(4,'Garfield','Gato'),(5,'Oddie','Perro')");
                //para mostrar necesito guardarlos a los valores en una clase de tipo ResultSet
                logger.warn("se insertaron correctamente los animales");
                ResultSet rs= statement.executeQuery("SELECT * FROM ANIMALES");
                //SIEMPRE
                while (rs.next()){
                    System.out.println("ID: "+rs.getInt(1)+" Nombre: "+rs.getString(2)+" Tipo: "+rs.getString(3));
                                }
                System.out.println("******************************************************");
                //ahora eliminamos uno
                statement.execute("DELETE FROM ANIMALES WHERE ID=2");
                logger.warn("se elimino el ID 2");
                //MOSTRAR NUEVAMENTE
                ResultSet rs1= statement.executeQuery("SELECT * FROM ANIMALES");
                //SIEMPRE
                while (rs1.next()){
                    System.out.println("ID: "+rs1.getInt(1)+" Nombre: "+rs1.getString(2)+" Tipo: "+rs1.getString(3));
                                    }

            }catch (Exception e){
                e.printStackTrace();
            }finally {
                try{
                    connection.close();
                    logger.warn("se cerro correctamente la conexion a la bdd");


                }catch (SQLException ex){
                    ex.getMessage();
                }
            }
    }
    public static Connection getConnection()throws Exception{
        //estamos creando un metodo que nos devuelve la conexxion y nos carga el driver necesario
        Class.forName("org.h2.Driver");
      return DriverManager.getConnection("jdbc:h2:~/C3Animales","sa","sa");
    }
}
