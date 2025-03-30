package Models;

import java.util.Date;

public class Producto {
    private int id;
    private String nombreProducto;
    private int id_categoria; // Relación con categoria
    private Date fechaVencimiento;
    private int cantidad;
    private double precio;

    public Producto() {
    }

    public Producto(int id, String nombreProducto, int id_categoria, Date fechaVencimiento, int cantidad, double precio) {
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.id_categoria = id_categoria;
        this.fechaVencimiento = fechaVencimiento;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) {
        this.id_categoria = id_categoria;
    }

    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
}
