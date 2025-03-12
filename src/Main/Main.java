package Main;

import Controllers.CategoriaController;
import Controllers.CompraVentaController;
import Controllers.ProductoController;
import Controllers.ProveedorController;
import Models.Categoria;
import Models.CompraVenta;
import Models.Producto;
import Models.Proveedor;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        //----------------------- CATEGORIA -----------------------------
        
        /*
        //INSTANCIA
        CategoriaController categoriaController = new CategoriaController();

        //Instancia del objeto (para evitar error de que ya esta definido)
        Categoria categoria;

        //INSERTAR
        categoria = new Categoria(7, "Tecnologia");
        categoriaController.InsertarCategoria(categoria);
        
        //ELIMINAR
        categoriaController.BorrarCategoria(1);

        //EDITAR
        categoria = new Categoria(7, "aseo");
        categoriaController.EditarCategoria(categoria);
        
        //LEER      
        categoriaController.imprimir();
        */

        //----------------------- PRODUCTO -----------------------------
        
        /*
        //INSTANCIA 
        ProductoController productoController = new ProductoController();

        //Instancia del objeto (para evitar error de que ya esta definido)
        Producto producto;

        //INSERTAR
        producto = new Producto(2, "PS5", categoria, new SimpleDateFormat("yyyy-MM-dd").parse("2025-01-01"), 5, 2.500);
        productoController.InsertarProducto(producto);
        
        //ELIMINAR
        productoController.BorrarProducto(1);

        //EDITAR
        producto = new Producto(5, "ELPEPE", categoria, new SimpleDateFormat("yyyy-MM-dd").parse("2025-11-11"), 5, 2.500);
        productoController.EditarProducto(producto);
        
        //LEER      
        productoController.imprimir();
        */

        //----------------------- COMPRAVENTA -----------------------------
        
        /*
        //INSTANCIA
        CompraVentaController compraVentaController = new CompraVentaController();

        //Instancia del objeto (para evitar error de que ya esta definido)
        CompraVenta compraVenta;

        //INSERTAR
        compraVenta = new CompraVenta(3, 750.000, 5, "250-IN", producto);
        compraVentaController.InsertarCompraVenta(compraVenta);

        //ELIMINAR
        compraVentaController.BorrarCompra(1);

        //EDITAR
        compraVenta = new CompraVenta(1, 550.000, 20, "100-IN", producto);        
        compraVentaController.EditarCompra(compraVenta);
        
        //LEER      
        compraVentaController.imprimir();
        */
        
        //----------------------- PROVEEDOR -----------------------------
        
        /*
        //INSTANCIA
        ProveedorController proveedorController = new ProveedorController();
        
        //Instancia del objeto (para evitar error de que ya esta definido)
        Proveedor proveedor;
        
        //INSERTAR
        proveedor = new Proveedor(1,"Juan","juan@gmail.com","3102409080","calle 10");
        proveedorController.InsertarProveedor(proveedor);
        
        //ELIMINAR
        proveedorController.BorrarProveedor(1);
        
        //EDITAR
        proveedor = new Proveedor(1,"Juan","juan@gmail.com","3102409080","calle 40");
        proveedorController.EditarProveedor(proveedor);
        
        //LEER      
        proveedorController.ImprimirProveedor();
        */
        
    }

}
