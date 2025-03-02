package DB;

import Models.Compra;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author migue
 */
public class DBCompra {
    public ArrayList <Compra> lstCompras;
    
    public DBCompra(){
        lstCompras = new ArrayList<>();
        this.InicializarLista();
    }
    
    public void InicializarLista() {
        lstCompras.add(new Compra(1, 7.000, 1, 001));
        lstCompras.add(new Compra(2, 6.000, 2, 002));
        lstCompras.add(new Compra(3, 5.000, 2, 003));
        lstCompras.add(new Compra(4, 3.000, 4, 004));
        lstCompras.add(new Compra(5, 11.000, 6, 005));
    }
}
