package Services;

import DB.CategoriaDB;
import Models.Categoria;

import java.util.List;

public class CategoriaService {

    public CategoriaDB categoriaDB;

    public CategoriaService() {
        this.categoriaDB = new CategoriaDB();
    }

    public Boolean InsertarCategoria(Categoria nuevaCategoria) {
        return this.categoriaDB.lstCategorias.add(nuevaCategoria);
    }

    public Boolean EditarCategoria(Categoria categoria) {
        boolean respuesta = false;
        List<Categoria> lstCategorias = this.categoriaDB.lstCategorias;

        for (int i = 0; i < lstCategorias.size(); i++) {
            if (lstCategorias.get(i) != null && lstCategorias.get(i).getId() == categoria.getId()) {
                lstCategorias.set(i, categoria);
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    public Boolean BorrarCategoria(int id) {
        boolean respuesta = false;
        List<Categoria> lstCategorias = this.categoriaDB.lstCategorias;

        for (int i = 0; i < lstCategorias.size(); i++) {
            if (lstCategorias.get(i) != null && lstCategorias.get(i).getId() == id) {
                lstCategorias.remove(i);
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    public void mostrarCategorias() {
        System.out.println("-------------------------------------------------");
        List<Categoria> lstCategorias = this.categoriaDB.lstCategorias;

        for (int i = 0; i < lstCategorias.size(); i++) {
            if (lstCategorias.get(i) != null) {
                System.out.println("Codigo: " + lstCategorias.get(i).getId());
                System.out.println("Nombre: " + lstCategorias.get(i).getNombre());
            }
        }
        System.out.println("-------------------------------------------------");
    }

}
