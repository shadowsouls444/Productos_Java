package Services;

import java.sql.ResultSet;
import DB.DataBase;
import Models.Categoria;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CategoriaService {

    public void AgregarCategoria(Categoria categoria) {
        Connection conexion = DataBase.Conectar();
        String sql = "INSERT INTO categorias(id, nombre) VALUES (?, ?)";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {
            stmt.setInt(1, categoria.getId());
            stmt.setString(2, categoria.getNombre());
            stmt.executeUpdate();
            System.out.println("La categoria se registro correctamente");
        } catch (SQLException e) {
            System.out.println("ERROR: Al registrar categoria " + e.getMessage());
        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    public void EliminarCategoria(int id) {

        Connection conexion = DataBase.Conectar();
        String sql = "DELETE FROM Categorias WHERE id = '" + id + "'";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {
            int filasAfectadas = stmt.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(null, "Datos eliminados");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontraron datos a eliminar");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al eliminar");
            System.out.println("ERROR: Al eliminar Categoria " + e.getMessage());

        } finally {

            DataBase.DesconectarDB(conexion);

        }
    }

    public void EditarCategoria(Categoria categoria, int id) {

        Connection conexion = DataBase.Conectar();
        String sql = "UPDATE Categorias SET nombre = ? WHERE id = '" + id + "'";

        try ( PreparedStatement stmt = conexion.prepareStatement(sql)) {

            stmt.setString(1, categoria.getNombre());
            stmt.executeUpdate();
            System.out.println("La categoria se edito correctamente");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "No se pudo actualizar el registro de la persona." + e, "ERROR al ACTUALIZAR", JOptionPane.ERROR_MESSAGE);
            System.out.println("ERROR: Al editar categoria " + e.getMessage());

        } finally {
            DataBase.DesconectarDB(conexion);
        }
    }

    public ResultSet ConsultarCategoria(String ConsultaSQL) {
        Connection conexion = DataBase.Conectar();
        ResultSet rs = null;

        if (conexion != null) {
            try {
                PreparedStatement stmt = conexion.prepareStatement(ConsultaSQL);
                rs = stmt.executeQuery();  // Ejecuta la consulta y obtiene el ResultSet
            } catch (SQLException e) {
                System.out.println("ERROR: Al consultar las categorías " + e.getMessage());
            }
        }
        return rs;
    }

    public List<Categoria> ListarCategorias() {
        List<Categoria> listaCategorias = new ArrayList<>();
        String consultaSQL = "SELECT * FROM categorias";

        try (Connection conexion = DataBase.Conectar();  PreparedStatement stmt = conexion.prepareStatement(consultaSQL);  ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                Categoria categoria = new Categoria();
                categoria.setId(rs.getInt("id")); // asegúrate que "id" es el nombre correcto en tu BD
                categoria.setNombre(rs.getString("nombre")); // igual aquí

                listaCategorias.add(categoria);
            }

        } catch (SQLException e) {
            System.out.println("ERROR al listar categorías: " + e.getMessage());
        }

        return listaCategorias;
    }

    public Categoria ConsultarCategoria(int id) {
        String sql = "SELECT nombre FROM categorias WHERE id = '" + id + "'";

        Categoria categoriaEncontrada = new Categoria();
        try {
            Connection conexion = DataBase.Conectar();
            PreparedStatement consulta = conexion.prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();

            if (resultado.next()) {
                categoriaEncontrada.setNombre(resultado.getString("nombre"));
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros", "Error al recuperar la categoria", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase: " + this.getClass().getName());
        }
        return categoriaEncontrada;
    }

}
