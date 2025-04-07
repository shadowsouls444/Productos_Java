package Services;

import DB.DataBase;
import Models.Categoria;
import Models.Producto;

import javax.swing.*;
import java.sql.*;

public class ProductoService {

    public void AgregarProducto(Producto producto) {
        Connection conexion = DataBase.Conectar();

        String sql = "INSERT INTO productos(id, nombreProducto, categoria, fechaVencimiento, cantidad, precio) VALUES (?, ?, ?, ?, ?, ?)";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setInt(1, producto.getId());
            stmt.setString(2, producto.getNombreProducto());
            stmt.setInt(3, producto.getCategoria().getId());
            stmt.setDate(4, new java.sql.Date(producto.getFechaVencimiento().getTime()));
            stmt.setInt(5, producto.getCantidad());
            stmt.setDouble(6, producto.getPrecio());
            stmt.executeUpdate();
            System.out.println("El producto se registro correctamente");

        } catch (SQLException e) {

            System.out.println("ERROR: Al registrar producto " + e.getMessage());

        } finally {

            DataBase.DesconectarDB(conexion);

        }
    }

    // Editar producto
    public void EditarProducto(Producto producto, int id) {
        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE productos SET nombreProducto = ?, categoria = ?, fechaVencimiento = ?, cantidad = ?, precio = ? WHERE id = '" + id + "'";

        try ( PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setString(1, producto.getNombreProducto());
            preparedStatement.setInt(2, producto.getCategoria().getId());
            preparedStatement.setDate(3, new java.sql.Date(producto.getFechaVencimiento().getTime()));
            preparedStatement.setInt(4, producto.getCantidad());
            preparedStatement.setDouble(5, producto.getPrecio());
            preparedStatement.executeUpdate();
            System.out.println("El producto se ha modificado correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al editar producto " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    // Mostrar productos registrados
    public ResultSet ConsultarProductos(String ConsultaSQL) {

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

        try ( PreparedStatement preparedStatement = conexion.prepareStatement(sql)) {
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
            System.out.println("El producto se ha eliminado correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al eliminar producto " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    // Consultar a un producto para editar
    public Producto ConsultarProducto(int id) {
        String sql = "SELECT nombreProducto, categoria, fechaVencimiento, cantidad, precio, categorias.nombre "
                + "FROM productos "
                + "INNER JOIN categorias ON productos.categoria = categorias.id "
                + "WHERE productos.id = ?";

        Producto productoEncontrado = new Producto();

        try {
            Connection conexion = DataBase.Conectar();
            PreparedStatement consulta = conexion.prepareStatement(sql);
            consulta.setInt(1, id);
            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                productoEncontrado.setNombreProducto(resultado.getString("nombreProducto"));
                productoEncontrado.setFechaVencimiento(resultado.getDate("fechaVencimiento"));
                productoEncontrado.setCantidad(resultado.getInt("cantidad"));
                productoEncontrado.setPrecio(resultado.getDouble("precio"));

                // Creamos el objeto Categoria con id y nombre
                Categoria categoria = new Categoria();
                categoria.setId(resultado.getInt("categoria"));
                categoria.setNombre(resultado.getString("categorias.nombre"));

                productoEncontrado.setCategoria(categoria); // lo seteamos directamente
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros", "Error al recuperar el producto", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase: " + this.getClass().getName());
        }

        return productoEncontrado;
    }

}
