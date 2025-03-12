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

    // Editar producto
    public void EditarProducto(Producto producto) {
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE productos SET nombreProducto = ?, categoria = ?, fechaVencimiento = ?, cantidad = ?, precio = ? WHERE id = ?";

        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, producto.getNombreProducto());
            preparedStatement.setInt(2, producto.getCategoria().getId());
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
    public void MostrarProductos() {
        Connection conexion = DataBase.Conectar();
        String sql = "SELECT * FROM productos";

        try(PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String nombre = resultSet.getString(2);
                int idCategoria = resultSet.getInt(3);
                String fechaVencimiento = resultSet.getString(4);
                int cantidad = resultSet.getInt(5);
                double precio = resultSet.getDouble(6);

                System.out.println("PRODUCTOS REGISTRADOS EN LA BASE DE DATOS");
                System.out.println("------------------------");
                System.out.println("ID: " + id);
                System.out.println("NOMBRE: " + nombre);
                System.out.println("ID_CATEGORIA: " + idCategoria);
                System.out.println("FECHA_VENCIMENTO: " + fechaVencimiento);
                System.out.println("CANTIDAD: " + cantidad);
                System.out.println("PRECIO: " + precio);
            }

        } catch (SQLException e) {
            System.out.println("ERROR: Al mostrar productos " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
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

