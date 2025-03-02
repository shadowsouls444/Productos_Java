package Controllers;

import Models.Categoria;
import Services.CategoriaService;

public class CategoriaController {

    public CategoriaService categoriaService;

    public CategoriaController() {
        this.categoriaService = new CategoriaService();
    }

    public void InsertarCategoria(Categoria categoriaNueva) {
        boolean respuesta = categoriaService.InsertarCategoria(categoriaNueva);
        if (respuesta) {
            System.out.println("Registro guardado con exito");
        } else {
            System.out.println("Estamos presentando problemas porfavor comuniquese con el administrador");
        }
    }

    public void BorrarCategoria(int id) {
        boolean respuesta = categoriaService.BorrarCategoria(id);
        if (respuesta) {
            System.out.println("Se elimino la categoria con el id: " + id);
        } else {
            System.out.println("No hay categoria en este id");
        }
    }

    public void EditarCategoria(Categoria editarCategoria) {
        boolean respuesta = categoriaService.EditarCategoria(editarCategoria);
        if (respuesta) {
            System.out.println("Se editó la categoria con el ID: " + editarCategoria.getId());
            System.out.println("Nombre: " + editarCategoria.getNombre());
        } else {
            System.out.println("No se encontró una categoria con este ID.");
        }
    }

    public void mostrarCategorias() {
        categoriaService.mostrarCategorias();
    }

}
