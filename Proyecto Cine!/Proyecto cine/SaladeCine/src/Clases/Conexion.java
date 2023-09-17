
package Clases;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
      Connection cn;
    public Connection getConnection(){
        try{
            String myBD="jdbc:mysql://localhost/bdcine";
            cn= (Connection) DriverManager.getConnection(myBD,"root","");
            System.out.println("Bienvenido");
            return cn;
        }catch(SQLException e){
            System.out.print(e.toString());
        }
        return null;
    }
}
