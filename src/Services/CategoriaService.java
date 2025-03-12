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
    
    public void EliminarCategoria(int id) {
        
        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM Categorias WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("La Categoria se elimino correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al eliminar Categoria " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void EditarCategoria(Categoria categoria) {
        
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE Categorias SET nombre = ? WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setString(1, categoria.getNombre());
            stmt.setInt(2, categoria.getId());
            stmt.executeUpdate();
            System.out.println("La categoria se edito correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al editar categoria " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void MostrarCategoria() {
        
        Connection conexion = DataBase.Conectar();
        String sql = "SELECT * FROM Categorias";
        
         try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
             
             //Usamos ResultSet para obtener los datos de columna correspondientes a un fila y se lo asignamos a una variable rs
             //Ejecutamos el query con executeQuery
             ResultSet rs = stmt.executeQuery();
             
             //Usamos rs.next para mostrar todas las filas hasta que sea false
             while(rs.next()){
                 
                 //Almacenamos los datos en una variable de acuerdo a la posicion de la fila
                 int id = rs.getInt(1);
                 String nombre = rs.getString(2);
                 
                 System.out.println("Datos de la compra venta con ID: " + id);
                 System.out.println("--------------");
                 System.out.println("nombre: " + nombre);
                 System.out.println("");
                 
             }
             
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al consultar Categorias " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
}
