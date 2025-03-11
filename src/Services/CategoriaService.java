package Services;

import DB.DataBase;
import Models.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CategoriaService {
    
    public void AgregarCategoria(Categoria categoria) {
        Connection conexion = DataBase.Conectar();
        String sql = "INSERT INTO categorias(id, nombre) VALUES (?, ?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getNombre());
            stmt.executeUpdate();
            System.out.println("La categoria se registro correctamente");
        } catch(SQLException e) {
            System.out.println("ERROR: Al registrar categoria " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }
    
}
