package Controllers;

import Models.CompraVenta;
import Services.CompraVentaService;

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

    public void EditarCompra(CompraVenta compraVenta) {
        
        compraVentaService.EditarCompraVenta(compraVenta);
        
    }

    public void imprimir() {
        
        compraVentaService.MostrarCompraVenta();
        
    }
    
}
