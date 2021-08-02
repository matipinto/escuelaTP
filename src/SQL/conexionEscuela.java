
package SQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conexionEscuela {

  
    public static Connection conectar() {
        Connection conexion = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conexion = DriverManager.getConnection("jdbc:sqlite:escuela.db");
            Statement sentencia = conexion.createStatement();
            sentencia.setQueryTimeout(30);
            
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: " + e);

        }
        return conexion;
    }
}
