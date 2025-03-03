package Controllers;

import Models.Compra;
import Services.CompraService;

public class CompraController {
    
    public CompraService CompraService;
    
    public CompraController() {
        this.CompraService = new CompraService();
    }
    
    public void InsertarCompra(Compra CompraNuevo) {

        boolean respuesta = CompraService.InsertarCompra(CompraNuevo);

        if (respuesta) {
            System.out.println("Registro guardado con exito");
        } else {
            System.out.println("Estamos presentando problemas porfavor comuniquese con el administrador");
        }

    }

    public void BorrarCompra(int id) {

        boolean respuesta = CompraService.BorrarCompra(id);

        if (respuesta) {
            System.out.println("Se elimino el proveedor con el id: " + id);
        } else {
            System.out.println("No hay proveedor en este id");
        }

    }

    public void EditarCompra(Compra editarCompra) {
        
        boolean respuesta = CompraService.EditarCompra(editarCompra);

        if (respuesta) {
            System.out.println("Se editó el proveedor con el ID: " + editarCompra.getId());
            System.out.println("Nombre: " + editarCompra.getId());
            System.out.println("Correo: " + editarCompra.getTotal());
            System.out.println("Numero: " + editarCompra.getCantidad());
            System.out.println("Direccion: " + editarCompra.getCodFactura());
            System.out.println("Direccion: " + editarCompra.getProducto());
        } else {
            System.out.println("No se encontró un proveedor con este ID.");
        }
    }

    public void imprimir() {
        CompraService.imprimir();
    }
    
}
