package Services;

import DB.DataBase;
import Models.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date; 

public class ProductoService {
    
    public void AgregarProducto(Producto producto) {
        Connection conexion = DataBase.Conectar();

        String sql = "INSERT INTO productos(id, nombreProducto, categoria, fechaVencimiento, cantidad, precio) VALUES (?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getNombreProducto());
            stmt.setInt(3, producto.getCategoria().getId());
            stmt.setDate(4, new java.sql.Date(producto.getFechaVencimiento().getTime()));
            stmt.setInt(5, producto.getCantidad());
            stmt.setDouble(6, producto.getPrecio());
            stmt.executeUpdate();
            System.out.println("El producto se registro correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al registrar producto " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
}

