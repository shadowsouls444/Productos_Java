package Controllers;

import Models.Categoria;
import Services.CategoriaService;

public class CategoriaController {
    
     public CategoriaService categoriaService;

    public CategoriaController() {
        this.categoriaService = new CategoriaService();
    }

    public void InsertarCategoria(Categoria categoria) {
        
        categoriaService.AgregarCategoria(categoria);
        
    }

    public void BorrarCategoria(int id) {
        
        categoriaService.EliminarCategoria(id);
       
    }

    public void EditarCategoria(Categoria categoria) {
        
        categoriaService.EditarCategoria(categoria);
        
    }

    public void imprimir() {
        
        categoriaService.MostrarCategoria();
        
    }

}
