package Models;


public class Proveedor {
    
    private int id;
    private String nombre;
    private String correo;
    private int numero;
    private String direccion;

    public Proveedor() {
    }
    
    
    public Proveedor(int id, String nombre, String correo, int numero, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.numero = numero;
        this.direccion = direccion;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
    
    
}
