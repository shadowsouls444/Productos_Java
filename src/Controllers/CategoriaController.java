package Controllers;

import Models.Categoria;
import Services.CategoriaService;
import java.sql.*;

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

    public ResultSet ConsultarCategorias(String ConsultaSQL) {
        
        return categoriaService.ConsultarCategoria(ConsultaSQL);
        
    }
    
    public Categoria ConsultarCategoria(int idCategoria) {
        return categoriaService.ConsultarCategoria(idCategoria);
    }

}
