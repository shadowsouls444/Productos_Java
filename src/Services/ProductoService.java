package Services;
import DB.DataBase;
import Models.Producto;

public class ProductoService {
    
    public DataBase db;
    
    public ProductoService(){
        this.db = new DataBase();
        this.db.InicializarListaProducto();
    }
    
     public boolean InsertarProducto(Producto nuevoProducto) {

        return this.db.lstProductos.add(nuevoProducto);

    }
       public boolean EditarProducto(Producto editarProducto) {

        boolean respuesta = false;

        for (int i = 0; i < this.db.lstProductos.size(); i++) {
            if (this.db.lstProductos.get(i) != null && this.db.lstProductos.get(i).getId() == editarProducto.getId()) {

                this.db.lstProductos.set(i, editarProducto);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }
       public boolean BorrarProducto(int id) {
        boolean respuesta = false;

        for (int i = 0; i < this.db.lstProductos.size(); i++) {

            if (this.db.lstProductos.get(i) != null && this.db.lstProductos.get(i).getId() == id) {
                this.db.lstProductos.remove(i);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }

    public void imprimir() {
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < this.db.lstProductos.size(); i++) {

            if (this.db.lstProductos.get(i) != null) {

                System.out.println("Codigo: " + this.db.lstProductos.get(i).getId());
                System.out.println("Nombre: " + this.db.lstProductos.get(i).getNombreProducto());
                System.out.println("Cantidad: " + this.db.lstProductos.get(i).getCantidad());
                System.out.println("Precio: " + this.db.lstProductos.get(i).getPrecio());
                System.out.println("Categoria: " + this.db.lstProductos.get(i).getCategoria());
                System.out.println("Fecha de Vencimiento: " + this.db.lstProductos.get(i).getFechaVencimiento());
                System.out.println("");

            }

        }
        System.out.println("---------------------------------------------------");
    }
}

