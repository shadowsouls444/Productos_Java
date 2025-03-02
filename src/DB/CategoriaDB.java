package DB;

import Models.Categoria;

import java.util.ArrayList;

public class CategoriaDB {

    public ArrayList<Categoria> lstCategorias;

    public CategoriaDB() {
        lstCategorias = new ArrayList<>();
        this.InicializarCategorias();
    }

    public void InicializarCategorias() {
        lstCategorias.add(new Categoria(1, "Tecnologia"));
        lstCategorias.add(new Categoria(2, "Hogar"));
        lstCategorias.add(new Categoria(3, "Deportes"));
        lstCategorias.add(new Categoria(4, "Ropa"));
        lstCategorias.add(new Categoria(5, "Juguetes"));
    }

}
