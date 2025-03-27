package Services;

import java.sql.ResultSet;
import DB.DataBase;
import Models.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaService {

    public void AgregarCategoria(Categoria categoria) {
        Connection conexion = DataBase.Conectar();
        String sql = "INSERT INTO categorias(id, nombre) VALUES (?, ?)";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getNombre());
            stmt.executeUpdate();
            System.out.println("La categoria se registro correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al registrar categoria " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    public void EliminarCategoria(int id) {

        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM Categorias WHERE id = ?";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("La Categoria se elimino correctamente");

        } catch (SQLException e) {

            System.out.println("ERROR: Al eliminar Categoria " + e.getMessage());

        } finally {

            DataBase.DesconectarDB(conexion);

        }
    }

    public void EditarCategoria(Categoria categoria) {

        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE Categorias SET nombre = ? WHERE id = ?";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, categoria.getNombre());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();
            System.out.println("La categoria se edito correctamente");

        } catch (SQLException e) {

            System.out.println("ERROR: Al editar categoria " + e.getMessage());

        } finally {

            DataBase.DesconectarDB(conexion);

        }
    }

    public ResultSet ConsultarCategoria(String ConsultaSQL) {
        
        // Establecer la conexión
        Connection conexion = DataBase.Conectar();
        
        //Inicializar el resultado como null
        ResultSet rs = null;

        try {
            // Crear el PreparedStatement
            PreparedStatement stmt = conexion.prepareStatement(ConsultaSQL);

            // Ejecutar el query y obtener el ResultSet
            rs = stmt.executeQuery();

            // NO cerrar la conexión ni el Statement aquí, ya que los necesitamos afuera
        } catch (SQLException e) {
            System.out.println("ERROR: Al consultar Categorias " + e.getMessage());
        }

        // Devolver el ResultSet para que se procese fuera del método
        return rs;  
    }

}
