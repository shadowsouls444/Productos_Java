package Controllers;

import static DB.DataBase.Conectar;
import Models.Categoria;
import Services.CategoriaService;
import java.sql.*;
import javax.swing.JOptionPane;

public class CategoriaController {
    
     public CategoriaService categoriaService;

    public CategoriaController() {
        this.categoriaService = new CategoriaService();
    }

    public void InsertarCategoria(Categoria categoria) {
        
        categoriaService.AgregarCategoria(categoria);
        
    }

    public void BorrarCategoria(int id) {
        System.out.println("ID: " + id);
        
        categoriaService.EliminarCategoria(id);
       
    }

    public void EditarCategoria(Categoria categoria, int id) {
        
        categoriaService.EditarCategoria(categoria, id);
        
    }

    public ResultSet ConsultarCategoria(String ConsultaSQL) {
        
        return categoriaService.ConsultarCategoria(ConsultaSQL);
        
    }
    
    public Categoria Consultar(int id) {
        String sql = "SELECT nombre FROM categorias WHERE id = '" + id + "'";
        
        Categoria categoriaEncontrada = new Categoria();
        try {
            Conectar();
            PreparedStatement consulta = Conectar().prepareStatement(sql);
            ResultSet resultado = consulta.executeQuery();
            
            if(resultado.next()) {
                System.out.println("Ingreso");
                categoriaEncontrada.setNombre(resultado.getString("nombre"));
            }
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "No se encontraron registros", "Error al recuperar la categoria", JOptionPane.ERROR_MESSAGE);
            System.out.println("Error de tipo: " + e);
            System.out.println("Error en la clase: " + this.getClass().getName());
        }
        return categoriaEncontrada;
    }

}
