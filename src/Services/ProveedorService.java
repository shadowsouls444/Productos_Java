package Services;

import java.sql.ResultSet;
import DB.DataBase;
import Models.CompraVenta;
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
    
    public ResultSet ConsultarProveedor(String ConsultaSQL) {
        
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
            System.out.println("ERROR: Al consultar Proveedor " + e.getMessage());
        }

        // Devolver el ResultSet para que se procese fuera del método
        return rs;  
    }
    
        // Consultar una compra-venta para editar, incluyendo detalles del producto asociado
public Proveedor ConsultarProveedor(int id) {
    // Consulta SQL que incluye detalles del producto relacionado con la compra-venta
    String sql = "SELECT * FROM proveedor WHERE id = ?";

    Proveedor proveedorEncontrado = new Proveedor();

    try {
        // Establecer la conexión con la base de datos
        Connection conexion = DataBase.Conectar();
        PreparedStatement consulta = conexion.prepareStatement(sql);
        consulta.setInt(1, id); // Establecer el parámetro de consulta
        ResultSet resultado = consulta.executeQuery();

        if (resultado.next()) {
            // Crear un objeto CompraVenta y establecer sus valores
            proveedorEncontrado.setId(resultado.getInt("id"));
            proveedorEncontrado.setCorreo(resultado.getDouble("total"));
            proveedorEncontrado.setCantidad(resultado.getInt("cantidad"));
            proveedorEncontrado.setCodFactura(resultado.getString("codFactura"));

        }

    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "No se encontraron registros", "Error al recuperar la compra-venta", JOptionPane.ERROR_MESSAGE);
        System.out.println("Error de tipo: " + e);
        System.out.println("Error en la clase: " + this.getClass().getName());
    }

    return compraVentaEncontrada;
}
}
