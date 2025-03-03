package Services;

import DB.DataBase;
import Models.Categoria;

import java.util.List;

public class CategoriaService {

    public DataBase db;

    public CategoriaService() {
        this.db = new DataBase();
        this.db.InicializarCategorias();
    }

    public Boolean InsertarCategoria(Categoria nuevaCategoria) {
        return this.db.lstCategorias.add(nuevaCategoria);
    }

    public Boolean EditarCategoria(Categoria categoria) {
        boolean respuesta = false;
        List<Categoria> lstCategorias = this.db.lstCategorias;

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
        List<Categoria> lstCategorias = this.db.lstCategorias;

        for (int i = 0; i < lstCategorias.size(); i++) {
            if (lstCategorias.get(i) != null && lstCategorias.get(i).getId() == id) {
                lstCategorias.remove(i);
                respuesta = true;
                break;
            }
        }
        return respuesta;
    }

    public void imprimir() {
        System.out.println("-------------------------------------------------");
        List<Categoria> lstCategorias = this.db.lstCategorias;

        for (int i = 0; i < lstCategorias.size(); i++) {
            if (lstCategorias.get(i) != null) {
                System.out.println("Codigo: " + lstCategorias.get(i).getId());
                System.out.println("Nombre: " + lstCategorias.get(i).getNombre());
            }
        }
        System.out.println("-------------------------------------------------");
    }

}
