package Services;

import DB.DBCompra;
import Models.Compra;

public class CompraService {
    
    public DBCompra db;
    
    //constructor
    
    public CompraService() {
        this.db = new DBCompra();
    }
    
    //insertar compra
    
    public boolean InsertarCompra(Compra nuevoCompra) {

        return this.db.lstCompras.add(nuevoCompra);
    }
    
    //editar compra
    
    public boolean EditarCompra(Compra editarCompra) {

        boolean respuesta = false;

        for (int i = 0; i < this.db.lstCompras.size(); i++) {
            if (this.db.lstCompras.get(i) != null && this.db.lstCompras.get(i).getId() == editarCompra.getId()) {

                this.db.lstCompras.set(i, editarCompra);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }
    
    //borrar compra
    
    public boolean BorrarCompra(int id) {
        boolean respuesta = false;

        for (int i = 0; i < this.db.lstCompras.size(); i++) {

            if (this.db.lstCompras.get(i) != null && this.db.lstCompras.get(i).getId() == id) {
                this.db.lstCompras.remove(i);
                respuesta = true;
                break;
            }
        }

        return respuesta;
    }
    
    //imprimir compra
    
    public void imprimir() {
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < this.db.lstCompras.size(); i++) {

            if (this.db.lstCompras.get(i) != null) {

                System.out.println("Codigo: " + this.db.lstCompras.get(i).getId());
                System.out.println("Total: " + this.db.lstCompras.get(i).getTotal());
                System.out.println("Cantidad: " + this.db.lstCompras.get(i).getCantidad());
                System.out.println("Codigo Factura: " + this.db.lstCompras.get(i).getCodFactura());
                System.out.println("");

            }

        }
        System.out.println("---------------------------------------------------");
    }
    
}
