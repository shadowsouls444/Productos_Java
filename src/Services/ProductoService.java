package Services;

import DB.DataBase;
import Models.Producto;

import java.sql.*;

public class ProductoService {
    
    public void AgregarProducto(Producto producto) {
        Connection conexion = DataBase.Conectar();

        String sql = "INSERT INTO productos(id, nombreProducto, categoria, fechaVencimiento, cantidad, precio) VALUES (?, ?, ?, ?, ?, ?)";
        
        try(PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getNombreProducto());
            stmt.setInt(3, producto.getId_categoria());
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

    // Editar producto
    public void EditarProducto(Producto producto) {
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE productos SET nombreProducto = ?, categoria = ?, fechaVencimiento = ?, cantidad = ?, precio = ? WHERE id = ?";

        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, producto.getNombreProducto());
            preparedStatement.setInt(2, producto.getId_categoria());
            preparedStatement.setDate(3, new java.sql.Date(producto.getFechaVencimiento().getTime()));
            preparedStatement.setInt(4, producto.getCantidad());
            preparedStatement.setDouble(5, producto.getPrecio());
            preparedStatement.setInt(6, producto.getId());
            preparedStatement.executeUpdate();
            System.out.println("El producto se ha modificado correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al editar producto " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    // Mostrar productos registrados
    public ResultSet ConsultarProducto(String ConsultaSQL) {
        
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
            System.out.println("ERROR: Al consultar Productos " + e.getMessage());
        }

        // Devolver el ResultSet para que se procese fuera del método
        return rs;  
    }

    //Eliminar producto
    public void EliminarProducto(int id) {
        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM productos WHERE id = ?";

        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("El producto se ha eliminado correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al eliminar producto " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }
    
}

