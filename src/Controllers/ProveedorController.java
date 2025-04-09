package Controllers;

import Models.Proveedor;
import Services.ProveedorService;
import java.sql.ResultSet;

public class ProveedorController {
        
    public ProveedorService proveedorService;
        
    public ProveedorController(){
        this.proveedorService = new ProveedorService();
    }
    
    public void InsertarProveedor(Proveedor proveedor){
        
        proveedorService.AgregarProveedor(proveedor);
        
    }
    
    public void BorrarProveedor(int id){
        
        proveedorService.EliminarProveedor(id);
        
    }
    
    public void EditarProveedor(Proveedor proveedor, int id){
        
        proveedorService.EditarProveedor(proveedor, id);
    
    }
    
    public ResultSet ConsultarProveedor(String ConsultaSQL) {
        
        return proveedorService.ConsultarProveedor(ConsultaSQL);
        
    }
    
    public Proveedor ConsultarProveedor(int idProveedor) {
        return proveedorService.ConsultarProveedor(idProveedor);
    }
}
