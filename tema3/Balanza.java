/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;

/**
 *
 * @author usuario
 */
public class Balanza {

        private int cant;
        private double monto;
    
public void iniciarCompra(){
    cant = 0;
    monto = 0;
}

public void registrarProducto(double cantkilos,double preciokilos){
    cant +=1;
    monto += cantkilos * preciokilos;
}

public double getMonto(){
return monto;
}

public String getResumenCompra(){
    String aux = "Total a pagar "+ monto + " por la compra de " + cant + " productos";
return aux;
}
}
