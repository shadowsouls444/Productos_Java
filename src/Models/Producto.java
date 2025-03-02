/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author Usuario
 */
public class Producto {
    private int id;
    private String nombreProducto;
    private int categoria;
    private String fechaVencimiento;
    private int cantidad;
    private int precio;
    
    public Producto(int id,String nombreProducto, int categoria,String fechaVencimiento, int cantidad, int precio){
        this.id = id;
        this.nombreProducto = nombreProducto;
        this.cantidad = cantidad;
        this.categoria = categoria;
        this.precio = precio;
        this.fechaVencimiento = fechaVencimiento;
    }

   
    public int getId (){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getNombreProducto(){
        return this.nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }
    
     public int getCategoria(){
        return this.categoria;
    }
     
    public void setCategoria(int categoria){
        this.categoria = categoria;
    }
    
     public String getFechaVencimiento(){
        return this.fechaVencimiento;
    }
     
    public void setFechaVencimiento(String fechaVencimiento){
        this.fechaVencimiento = fechaVencimiento;
    }
    
     public int getCantidad(){
        return this.cantidad;
    }
     
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    
      public int getPrecio(){
        return this.precio;
    }
      
    public void setPrecio(int precio){
        this.precio = precio    ;
    }

    
    
    
    
}
