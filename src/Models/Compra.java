package Models;

public class Compra {
    
    private int id;
    private double total;
    private int cantidad;
    private int codFactura;
    private int producto;

    public Compra() {
    }

    public Compra(int id, double total, int cantidad, int codFactura, int producto) {
        this.id = id;
        this.total = total;
        this.cantidad = cantidad;
        this.codFactura = codFactura;
        this.producto = producto;
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

    public void setTotal(double total) {
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(int codFactura) {
        this.codFactura = codFactura;
    }

    public int getProducto() {
        return producto;
    }

    public void setProducto(int producto) {
        this.producto = producto;
    }
    
    
    
}
