package Controllers;

import Models.Venta;
import Services.VentaService;

public class VentaController {
    
    public VentaService ventaService;
    
    public VentaController() {
        this.ventaService = new VentaService();
    }
    
    public void InsertarProveedor(Venta ventaNueva) {

        boolean respuesta = ventaService.InsertarVenta(ventaNueva);

        if (respuesta) {
            System.out.println("Registro guardado con exito");
        } else {
            System.out.println("Estamos presentando problemas");
        }

    }
    
    public void BorrarVenta(int id) {

        boolean respuesta = ventaService.BorrarVenta(id);

        if (respuesta) {
            System.out.println("Se elimino la venta con el id: " + id);
        } else {
            System.out.println("No hay una venta en este id");
        }

    }
    
    public void EditarVenta(Venta editarVenta) {
        
        boolean respuesta = ventaService.EditarVenta(editarVenta);

        if (respuesta) {
            System.out.println("Se editó el proveedor con el ID: " + editarVenta.getId());
            System.out.println("Nombre: " + editarVenta.getId());
            System.out.println("Correo: " + editarVenta.getTotal());
            System.out.println("Numero: " + editarVenta.getCantidad());
            System.out.println("Direccion: " + editarVenta.getCodigoFactura());
        } else {
            System.out.println("No se encontró una venta con este ID.");
        }
    }
    
    public void imprimir() {
        ventaService.imprimir();
    }
    
}
