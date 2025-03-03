package DB;

import Models.Categoria;
import Models.Compra;
import Models.Producto;
import Models.Proveedor;
import Models.Venta;
import java.util.ArrayList;

public class DataBase {

    //Idealizar Array en clase proveedor
    public ArrayList<Proveedor> lstProveedores;
    
    //Idealizar Array en clase venta
    public ArrayList<Venta> lstVentas;
    
    //Idealizar Array en clase Compra
    public ArrayList<Compra> lstCompras;
    
    //Idealizar Array en clase Categoria
    public ArrayList<Categoria> lstCategorias;
    
    //Idealizar Array en clase Producto
    public ArrayList<Producto> lstProductos;
    
    public DataBase() {
    }

    public void InicializarListaProveedores() {
        
        lstProveedores = new ArrayList<>();
        
        lstProveedores.add(new Proveedor(1, "Angel", "angel@gmail.com", "1024330119", "calle 156"));
        lstProveedores.add(new Proveedor(2, "Miguel", "miguel@gmail.com", "1011234567", "calle 200"));
        lstProveedores.add(new Proveedor(3, "Sebas Rivera", "sebas@gmail.com", "1027654321", "avenida 10"));
        lstProveedores.add(new Proveedor(4, "Sebas Morales", "morales@gmail.com", "1059876543", "carrera 5"));
        lstProveedores.add(new Proveedor(5, "Sebas Mena", "mena@gmail.com", "1112233445", "barrio central"));
    }
    
    public void InicializarListaVentas() {
        
        lstVentas = new ArrayList<>();
        
        lstVentas.add(new Venta(1, 33.021, 5, 1011457590, 1));
        lstVentas.add(new Venta(2, 50.892, 9, 1011234567, 3));
        lstVentas.add(new Venta(3, 30.000, 2, 1027654321, 5));
        lstVentas.add(new Venta(4, 25.000, 6, 1059876543, 7));
        lstVentas.add(new Venta(5, 60.000, 3, 1112233445, 9));
    }
    
    public void InicializarCategorias() {
        
        lstCategorias = new ArrayList<>();
        
        lstCategorias.add(new Categoria(1, "Tecnologia"));
        lstCategorias.add(new Categoria(2, "Hogar"));
        lstCategorias.add(new Categoria(3, "Deportes"));
        lstCategorias.add(new Categoria(4, "Ropa"));
        lstCategorias.add(new Categoria(5, "Juguetes"));
    }
    
    public void InicializarListaCompras() {
        
        lstCompras = new ArrayList<>();
        
        lstCompras.add(new Compra(1, 7.000, 1, 001, 3));
        lstCompras.add(new Compra(2, 6.000, 2, 002, 3));
        lstCompras.add(new Compra(3, 5.000, 2, 003, 4));
        lstCompras.add(new Compra(4, 3.000, 4, 004, 7));
        lstCompras.add(new Compra(5, 11.000, 6, 005, 9));
    }
    
    public void InicializarListaProducto() {
        
        lstProductos = new ArrayList<>();
        
        lstProductos.add(new Producto(1, "Arroz", 2, "2025-03-25", 6,2500));
        lstProductos.add(new Producto(2, "frijoles", 2, "2025-08-25", 12,2500));
        lstProductos.add(new Producto(3, "leche", 3, "2025-03-25", 30,4500));
        lstProductos.add(new Producto(4, "Harina", 5, "2025-12-25", 20,1500));
        lstProductos.add(new Producto(5, "Aceite", 6, "2025-09-25", 15,3000));
       
    }

}
