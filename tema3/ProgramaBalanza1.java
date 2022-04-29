/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class ProgramaBalanza1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cantKilos;
        String descripcion;
        double precioKilos;
        
        //Genera la balanza
        BalanzaR balancin = new BalanzaR();
        
        //Inicia la compra
        balancin.iniciarCompra();
        Producto prod; 
        //Registra los productos mientras que la cantidad de kilos sea diferente de 0
        do{
            cantKilos = Lector.leerDouble();
            
            if(cantKilos != 0){
                descripcion = Lector.leerString();
                precioKilos = Lector.leerDouble();
                prod = new Producto(cantKilos,descripcion);
                balancin.registrarProducto(prod,precioKilos);
            }
        }while(cantKilos != 0);
        
        //Imprime el resumen
        System.out.println(balancin.getResumenCompra());
        
    }
    
}
