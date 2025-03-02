package DB;

import Models.Venta;
import java.util.ArrayList;

public class DataBaseVenta {
    
    public ArrayList<Venta> lstVentas;
    
    public DataBaseVenta() {
        lstVentas = new ArrayList<>();
        this.InicializarLista();
    }
    
    public void InicializarLista() {
        lstVentas.add(new Venta(1, 33.021, 5, 1011457590));
        lstVentas.add(new Venta(2, 50.892, 9, 1011234567));
        lstVentas.add(new Venta(3, 30.000, 2, 1027654321));
        lstVentas.add(new Venta(4, 25.000, 6, 1059876543));
        lstVentas.add(new Venta(5, 60.000, 3, 1112233445));
    }
    
}
