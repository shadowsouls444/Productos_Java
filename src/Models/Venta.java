package Models;

public class Venta {
    
    private int id;
    private double total;
    private int cantidad;
    private int codigoFactura;

    public Venta() {
    }

    public Venta(int id, double total, int cantidad, int codigoFactura) {
        this.id = id;
        this.total = total;
        this.cantidad = cantidad;
        this.codigoFactura = codigoFactura;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(int codigoFactura) {
        this.codigoFactura = codigoFactura;
    }
    
    
    
}
