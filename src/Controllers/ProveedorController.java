package Controllers;

import Models.Proveedor;
import Services.ProveedorService;

public class ProveedorController {

    public ProveedorService proveedorService;

    public ProveedorController() {
        this.proveedorService = new ProveedorService();
    }

    public void InsertarProveedor(Proveedor proveedorNuevo) {

        boolean respuesta = proveedorService.InsertarProveedor(proveedorNuevo);

        if (respuesta) {
            System.out.println("Registro guardado con exito");
        } else {
            System.out.println("Estamos presentando problemas");
        }

    }

    public void BorrarProveedor(int id) {

        boolean respuesta = proveedorService.BorrarProveedor(id);

        if (respuesta) {
            System.out.println("Se elimino el proveedor con el id: " + id);
        } else {
            System.out.println("No hay proveedor en este id");
        }

    }

    public void EditarProveedor(Proveedor editarProveedor) {
        
        boolean respuesta = proveedorService.EditarProveedor(editarProveedor);

        if (respuesta) {
            System.out.println("Se editó el proveedor con el ID: " + editarProveedor.getId());
            System.out.println("Nombre: " + editarProveedor.getNombre());
            System.out.println("Correo: " + editarProveedor.getCorreo());
            System.out.println("Numero: " + editarProveedor.getNumero());
            System.out.println("Direccion: " + editarProveedor.getDireccion());
        } else {
            System.out.println("No se encontró un proveedor con este ID.");
        }
    }

    public void imprimir() {
        proveedorService.imprimir();
    }

}
