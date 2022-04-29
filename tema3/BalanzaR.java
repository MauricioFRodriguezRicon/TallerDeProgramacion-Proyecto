/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author usuario
 */
public class BalanzaR {

        private int cant;
        private double monto;
        private String resumen;
        
        
public void iniciarCompra(){
    cant = 0;
    monto = 0;
    resumen = "";
}
public void registrarProducto(Producto produ,double preciokilos){
    double aux = produ.getPesoEnKg() * preciokilos;
    cant +=1;
    monto += aux;
    resumen += "|| " + produ.getDescripcion() + " $" + aux;
}


public double getMonto(){
return monto;
}

public String getResumenCompra(){
    return resumen +" || || "+ "Total a pagar "+ monto + " por la compra de " + cant + " productos";
}
}
