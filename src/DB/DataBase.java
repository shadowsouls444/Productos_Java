package DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBase {
    private static final String url = "jdbc:mysql://localhost:3306/inventario";
    private static final String usuario = "root";
    private static final String password = "";
    
    public static Connection Conectar() {
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(url, usuario, password);
            System.out.println("Conexión exitosa");
        } catch(ClassNotFoundException e) {
            System.out.println("ERROR: El driver mysql no se encontro");
            e.printStackTrace();
        } catch(SQLException e) {
            System.out.println("Error de conexión");
            e.printStackTrace();
        }
        
        return conexion;
    }
    
    public static void DesconectarDB(Connection conexion) {
        if(conexion != null) {
            try {
                conexion.close();
                System.out.println("La conexión se cerro con éxito");
            } catch(SQLException e) {
                System.out.println("ERROR: Mal cierre de conexión " + e.getMessage());
            }
        }
    }
}
