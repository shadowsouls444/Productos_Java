package DB;

import Models.Proveedor;
import java.util.ArrayList;

public class DataBase {

    public ArrayList<Proveedor> lstProveedores;

    public DataBase() {
        lstProveedores = new ArrayList<>();
        this.InicializarLista();
    }

    public void InicializarLista() {
        lstProveedores.add(new Proveedor(1, "Angel", "angel@gmail.com", 1024330119, "calle 156"));
        lstProveedores.add(new Proveedor(2, "Miguel", "miguel@gmail.com", 1011234567, "calle 200"));
        lstProveedores.add(new Proveedor(3, "Sebas Rivera", "sebas@gmail.com", 1027654321, "avenida 10"));
        lstProveedores.add(new Proveedor(4, "Sebas Morales", "morales@gmail.com", 1059876543, "carrera 5"));
        lstProveedores.add(new Proveedor(5, "Sebas Mena", "mena@gmail.com", 1112233445, "barrio central"));
    }

}
