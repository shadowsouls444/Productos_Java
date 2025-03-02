
 
package Controllers;
import Models.Producto;
import Services.ProductoService;

public class ProductoController {
     public ProductoService productoService;

    public ProductoController() {
        this.productoService = new ProductoService();
    }
      public void InsertarProducto(Producto productoNuevo) {

        boolean respuesta = productoService.InsertarProducto(productoNuevo);

        if (respuesta) {
            System.out.println("Registro guardado con exito");
        } else {
            System.out.println("Estamos presentando problemas porfavor comuniquese con el administrador");
        }

    }

    public void BorrarProducto(int id) {

        boolean respuesta = productoService.BorrarProducto(id);

        if (respuesta) {
            System.out.println("Se elimino el producto con el id: " + id);
        } else {
            System.out.println("No hay Producto en este id");
        }

    }

    public void EditarProducto(Producto editarProducto) {
        
        boolean respuesta = productoService.EditarProducto(editarProducto);

        if (respuesta) {
            System.out.println("Se editó el Producto con el ID: " + editarProducto.getId());
            System.out.println("Nombre: " + editarProducto.getNombreProducto());
            System.out.println("Cantidad: " + editarProducto.getCantidad());
            System.out.println("Categoria: " + editarProducto.getCategoria());
            System.out.println("Precio: " + editarProducto.getPrecio());
            System.out.println("Fecha de Vencimiento: " + editarProducto.getFechaVencimiento());
        } else {
            System.out.println("No se encontró un Producto con este ID.");
        }
    }

    public void imprimir() {
        productoService.imprimir();
    }
}
