/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.Lector;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author usuario
 */
public class VectorMensajeOcultoEj4Prac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String vector[] = new String[10];
    
    for (int i=0;i<10;i++){
        vector[i]= GeneradorAleatorio.generarString(2);
}
    for (int i=0;i<10;i++){
        System.out.println(vector[i]);
}
    
    System.out.println("PALABRA SECRETA");
    
    String mensaje = "";
    
    for (int i=0;i<10;i++){
    mensaje = mensaje + vector[i].charAt(0);
    }
        
    System.out.println(mensaje);
    
    
    
    
    
    }
     
 
    
    
    
    
    
}
