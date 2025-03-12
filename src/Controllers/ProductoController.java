package Controllers;

import Models.Producto;
import Services.ProductoService;

public class ProductoController {
    
    public ProductoService productoService;
    
    public ProductoController(){
        
        this.productoService = new ProductoService();
        
    }
    
    public void InsertarProducto(Producto producto) {

        productoService.AgregarProducto(producto);

    }

    public void BorrarProducto(int id) {

       productoService.EliminarProducto(id);

    }

    public void EditarProducto(Producto producto) {
        
        productoService.EditarProducto(producto);
        
    }

    public void imprimir() {
        
        productoService.MostrarProductos();
        
    }
   
}
