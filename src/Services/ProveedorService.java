package Services;

import DB.DataBase;
import Models.Proveedor;

public class ProveedorService {

    public DataBase db;

    public ProveedorService() {
        this.db = new DataBase();
        this.db.InicializarListaProveedores();
    }

    public boolean InsertarProveedor(Proveedor nuevoProveedor) {

        return this.db.lstProveedores.add(nuevoProveedor);

    }

    public boolean EditarProveedor(Proveedor editarProveedor) {

        boolean respuesta = false;

        for (int i = 0; i < this.db.lstProveedores.size(); i++) {
            if (this.db.lstProveedores.get(i) != null && this.db.lstProveedores.get(i).getId() == editarProveedor.getId()) {

                this.db.lstProveedores.set(i, editarProveedor);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }

    public boolean BorrarProveedor(int id) {
        boolean respuesta = false;

        for (int i = 0; i < this.db.lstProveedores.size(); i++) {

            if (this.db.lstProveedores.get(i) != null && this.db.lstProveedores.get(i).getId() == id) {
                this.db.lstProveedores.remove(i);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }

    public void imprimir() {
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < this.db.lstProveedores.size(); i++) {

            if (this.db.lstProveedores.get(i) != null) {

                System.out.println("Codigo: " + this.db.lstProveedores.get(i).getId());
                System.out.println("Nombre: " + this.db.lstProveedores.get(i).getNombre());
                System.out.println("Correo: " + this.db.lstProveedores.get(i).getCorreo());
                System.out.println("Numero: " + this.db.lstProveedores.get(i).getNumero());
                System.out.println("Direccion: " + this.db.lstProveedores.get(i).getDireccion());
                System.out.println("");

            }

        }
        System.out.println("---------------------------------------------------");
    }
}
