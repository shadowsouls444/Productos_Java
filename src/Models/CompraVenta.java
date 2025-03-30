package Models;

public class CompraVenta {
    
    private int id;
    private double total;
    private int cantidad;
    private String codFactura;
    private int id_producto; // Relación con Producto

    public CompraVenta() {
    }

    public CompraVenta(int id, double total, int cantidad, String codFactura, int id_producto) {
        this.id = id;
        this.total = total;
        this.cantidad = cantidad;
        this.codFactura = codFactura;
        this.id_producto = id_producto;
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

    public String getCodFactura() {
        return codFactura;
    }

    public void setCodFactura(String codFactura) {
        this.codFactura = codFactura;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    
}
