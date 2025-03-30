package Services;

import java.sql.ResultSet;
import DB.DataBase;
import Models.CompraVenta;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CompraVentaService {
    
    public void AgregarCompraVenta(CompraVenta compraVenta) {
        
        Connection conexion = DataBase.Conectar();
        String sql = "INSERT INTO CompraVentas(id, total, cantidad, codFactura, producto) VALUES (?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, compraVenta.getId());
            stmt.setDouble(2, compraVenta.getTotal());
            stmt.setInt(3, compraVenta.getCantidad());
            stmt.setString(4, compraVenta.getCodFactura());
            stmt.setInt(5, compraVenta.getId_producto()); // Referencia al producto existente por id
            stmt.executeUpdate();
            System.out.println("La Compra-Venta se registro correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al registrar Compra-Venta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void EliminarCompraVenta(int id) {
        
        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM CompraVentas WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("La Compra-Venta se elimino correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al eliminar CompraVenta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void EditarCompraVenta(CompraVenta compraVenta) {
        
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE CompraVentas SET total = ?, cantidad = ?, codFactura = ?, producto = ? WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {
            
            stmt.setDouble(1, compraVenta.getTotal());
            stmt.setInt(2, compraVenta.getCantidad());
            stmt.setString(3, compraVenta.getCodFactura());
            stmt.setInt(4, compraVenta.getId_producto()); // Referencia al producto existente por id
            stmt.setInt(5, compraVenta.getId()); // Referencia al producto existente por id
            stmt.executeUpdate();
            System.out.println("La Compra-Venta se edito correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al editar CompraVenta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public ResultSet ConsultarCompraVenta(String ConsultaSQL) {
        
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
            System.out.println("ERROR: Al consultar CompraVentas " + e.getMessage());
        }

        // Devolver el ResultSet para que se procese fuera del método
        return rs;  
    }
    
}
