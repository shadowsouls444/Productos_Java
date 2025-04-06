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

    public void EditarProducto(Producto producto, int id) {
        
        productoService.EditarProducto(producto, id);
        
    }

    public ResultSet ConsultarProductos(String ConsultaSQL) {
        
        return productoService.ConsultarProductos(ConsultaSQL);
        
    }

    public Producto ConsultarProducto(int idProducto) {
        return productoService.ConsultarProducto(idProducto);
    }
   
}
