package Main;

import Models.Categoria;
import Models.CompraVenta;
import Models.Producto;
import Services.CategoriaService;
import Services.CompraVentaService;
import Services.ProductoService;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

    public static void main(String[] args) throws ParseException {

        //----------------------- CATEGORIA -----------------------------
        
        //INSTANCIA
        CategoriaService categoriaService = new CategoriaService();

        //Instancia del objeto (para evitar error de que ya esta definido)
        Categoria categoria;

        //INSERTAR
        /*
        categoria = new Categoria(3, "Aseo personal 500 ML");
        categoriaService.AgregarCategoria(categoria);
        */
        
        //ELIMINAR
        /*
        categoriaService.EliminarCategoria(1);
        */

        //EDITAR
        /*
        categoria = new Categoria(3, "Moachos");        
        categoriaService.EditarCategoria(categoria);
        */
        
        //LEER      
        categoriaService.MostrarCategoria();

        //----------------------- PRODUCTO -----------------------------
        
        /*
        //INSTANCIA 
        ProductoService productoService = new ProductoService();

        //Instancia del objeto (para evitar error de que ya esta definido)
        Producto producto;

        //INSERTAR
        producto = new Producto(1, "PS5", categoria, new SimpleDateFormat("yyyy-MM-dd").parse("2025-01-01"), 5, 2.500);
        productoService.AgregarProducto(producto);
        */

        //----------------------- COMPRAVENTA -----------------------------
        
        /*
        //INSTANCIA
        CompraVentaService compraVentaService = new CompraVentaService();

        //Instancia del objeto (para evitar error de que ya esta definido)
        CompraVenta compraVenta;

        //INSERTAR
        compraVenta = new CompraVenta(3, 750.000, 5, "250-IN", producto);
        compraVentaService.AgregarCompraVenta(compraVenta);

        //ELIMINAR
        compraVentaService.EliminarCompraVenta(1);

        //EDITAR
        /*
        compraVenta = new CompraVenta(1, 550.000, 20, "100-IN", producto);        
        compraVentaService.EditarCompraVenta(compraVenta);
             
        //LEER      
        compraVentaService.MostrarCompraVenta();
        */
        
    }

}
