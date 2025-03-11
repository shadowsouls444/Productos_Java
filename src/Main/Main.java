package Main;

import Models.Categoria;
import Services.CategoriaService;

public class Main {

    public static void main(String[] args) {
        CategoriaService categoriaService = new CategoriaService();
        Categoria categoria = new Categoria(1, "Tecnologia");
        
        categoriaService.AgregarCategoria(categoria);
    }

}
