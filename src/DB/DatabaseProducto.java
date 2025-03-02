package DB;

import Models.Producto;
import java.util.ArrayList;

public class DatabaseProducto {

    public ArrayList<Producto> lstProductos;

    public DatabaseProducto() {
        lstProductos = new ArrayList<>();
        this.InicializarLista();
    }

    public void InicializarLista() {
        lstProductos.add(new Producto(1, "Arroz", 2, "2025-03-25", 6,2500));
        lstProductos.add(new Producto(2, "frijoles", 2, "2025-08-25", 12,2500));
        lstProductos.add(new Producto(3, "leche", 3, "2025-03-25", 30,4500));
        lstProductos.add(new Producto(4, "Harina", 5, "2025-12-25", 20,1500));
        lstProductos.add(new Producto(5, "Aceite", 6, "2025-09-25", 15,3000));
       
    }

}