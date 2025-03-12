package Services;

import java.sql.ResultSet;
import DB.DataBase;
import Models.Proveedor;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class ProveedorService {
    
    public void AgregarProveedor(Proveedor proveedor){
        
        Connection conexion = DataBase.Conectar();
        String sql="INSERT INTO proveedor(id,nombre,correo,numeroCelular,direccion) VALUES (?,?,?,?,?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)){
            
            stmt.setInt(1, proveedor.getId());
            stmt.setString(2, proveedor.getNombre());
            stmt.setString(3, proveedor.getCorreo());
            stmt.setString(4, proveedor.getNumero());
            stmt.setString(5, proveedor.getDireccion());
            stmt.executeUpdate();
            System.out.println("El proveedor se registro correctamente");
            
        }catch(SQLException e){
            
            System.out.println("ERROR: Al registrar el proveedor " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void EliminarProveedor(int id){
        
        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM proveedor WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)){
            
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("El Proveedor se elimino correctamente");
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al eliminar el proveedor " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void EditarProveedor(Proveedor proveedor){
        
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE proveedor SET nombre = ?, correo = ?, numeroCelular = ?, direccion = ? WHERE id = ?";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)){
                        
            stmt.setString(1, proveedor.getNombre());
            stmt.setString(2, proveedor.getCorreo());
            stmt.setString(3, proveedor.getNumero());
            stmt.setString(4, proveedor.getDireccion());
            stmt.setInt(5, proveedor.getId());
            stmt.executeUpdate();
            System.out.println("El proveedor se edito correctamente");
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al editar CompraVenta " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
    
    public void MostrarProveedor(){
        
        Connection conexion = DataBase.Conectar();
        String sql ="SELECT * FROM proveedor";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)){
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                int id = rs.getInt(1);
                String nombre = rs.getString(2);
                String correo = rs.getString(3);
                String numeroCelular = rs.getString(4);
                String direccion = rs.getString(5);
                
                System.err.println("Datos del proveedor con el ID: " + id);
                System.out.println("--------------");
                System.out.println("Nombre: " + nombre);
                System.out.println("Correo: " + correo);
                System.out.println("Numero de Celular: " + numeroCelular);
                System.out.println("Direccion: " + direccion);
            }
            
        } catch(SQLException e) {
            
            System.out.println("ERROR: Al consultar Proveedor " + e.getMessage());
            
        } finally {
            
            DataBase.DesconectarDB(conexion);
            
        }
    }
}
