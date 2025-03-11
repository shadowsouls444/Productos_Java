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
            stmt.setInt(5, compraVenta.getProducto().getId()); // Referencia al producto existente por id
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
            stmt.setInt(4, compraVenta.getProducto().getId()); // Referencia al producto existente por id
            stmt.setInt(5, compraVenta.getId()); // Referencia al producto existente por id
            stmt.executeUpdate();
            System.out.println("La Compra-Venta se edito correctamente");
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al editar CompraVenta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void MostrarCompraVenta() {
        
        Connection conexion = DataBase.Conectar();
        String sql = "SELECT * FROM CompraVentas";
        
         try (PreparedStatement stmt = conexion.prepareStatement(sql)) {
             
             //Usamos ResultSet para obtener los datos de columna correspondientes a un fila y se lo asignamos a una variable rs
             //Ejecutamos el query con executeQuery
             ResultSet rs = stmt.executeQuery();
             
             //Usamos rs.next para mostrar todas las filas hasta que sea false
             while(rs.next()){
                 
                 //Almacenamos los datos en una variable de acuerdo a la posicion de la fila
                 int id = rs.getInt(1);
                 double total = rs.getDouble(2);
                 int cantidad = rs.getInt(3);
                 String codFactura = rs.getString(4);
                 int producto = rs.getInt(5);
                 
                 System.out.println("Datos de la compra venta con ID: " + id);
                 System.out.println("--------------");
                 System.out.println("total: " + total);
                 System.out.println("cantidad: " + cantidad);
                 System.out.println("Codigo de factura: " + codFactura);
                 System.out.println("ID producto: " + producto);
                 System.out.println("");
                 
             }
             
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al consultar CompraVenta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
}
