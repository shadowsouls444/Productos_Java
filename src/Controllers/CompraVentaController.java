package Controllers;

import Models.CompraVenta;
import Services.CompraVentaService;
import java.sql.ResultSet;

public class CompraVentaController {
    
    public CompraVentaService compraVentaService;
    
    public CompraVentaController() {
        this.compraVentaService = new CompraVentaService();
    }
    
    public void InsertarCompraVenta(CompraVenta compraVenta) {

        compraVentaService.AgregarCompraVenta(compraVenta);

    }

    public void BorrarCompra(int id) {

       compraVentaService.EliminarCompraVenta(id);

    }

    public void EditarCompra(CompraVenta compraVenta, int id) {
        
        compraVentaService.EditarCompraVenta(compraVenta, id);
        
    }

    public ResultSet ConsultarCompraVenta(String ConsultaSQL) {
        
        return compraVentaService.ConsultarCompraVenta(ConsultaSQL);
        
    }
    
    public CompraVenta ConsultarCompraVenta(int idCompraVenta) {
        return compraVentaService.ConsultarCompraVenta(idCompraVenta);
    }
    
}
