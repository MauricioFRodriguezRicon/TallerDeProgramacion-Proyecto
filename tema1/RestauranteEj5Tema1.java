/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema1;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class RestauranteEj5Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cali [][] = new int [5][4];
        
    
        
        for(int i=0;i<5;i++){
           for(int j=0;j<4;j++){
               cali[i][j] = Lector.leerInt();
           }
        }
        
        int suma;
        
        for(int j=0;j<4;j++){
            suma = 0;
           for(int i=0;i<5;i++){
           suma = suma+cali[i][j];
           }
           double promedio = (double)suma/5;
           System.out.println("En el aspecto "+ j + " el promedio es: " + promedio);
        }
        
        
        
    }
    
}
