package Controllers;

import Models.Producto;
import Services.ProductoService;
import java.sql.ResultSet;

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

    public ResultSet ConsultarProducto(String ConsultaSQL) {
        
        return productoService.ConsultarProducto(ConsultaSQL);
        
    }
   
}
