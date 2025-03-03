package Services;

import DB.DataBase;
import Models.Venta;

public class VentaService {
    
    public DataBase db;

    public VentaService() {
        this.db = new DataBase();
        this.db.InicializarListaVentas();
    }
    
    public boolean InsertarVenta(Venta nuevaVenta) {

        return this.db.lstVentas.add(nuevaVenta);

    }

     public boolean EditarVenta(Venta editarVenta) {

        boolean respuesta = false;

        for (int i = 0; i < this.db.lstVentas.size(); i++) {
            if (this.db.lstVentas.get(i) != null && this.db.lstVentas.get(i).getId() == editarVenta.getId()) {

                this.db.lstVentas.set(i, editarVenta);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }
     
     public boolean BorrarVenta(int id) {
        boolean respuesta = false;

        for (int i = 0; i < this.db.lstVentas.size(); i++) {

            if (this.db.lstVentas.get(i) != null && this.db.lstVentas.get(i).getId() == id) {
                this.db.lstVentas.remove(i);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }
     
     public void imprimir() {
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < this.db.lstVentas.size(); i++) {

            if (this.db.lstVentas.get(i) != null) {

                System.out.println("Codigo: " + this.db.lstVentas.get(i).getId());
                System.out.println("Total: " + this.db.lstVentas.get(i).getTotal());
                System.out.println("Correo: " + this.db.lstVentas.get(i).getCantidad());
                System.out.println("Numero: " + this.db.lstVentas.get(i).getCodigoFactura());
                System.out.println("ID producto: " + this.db.lstVentas.get(i).getProducto());
                System.out.println("");

            }

        }
        System.out.println("---------------------------------------------------");
    }
    
}
