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
public class OficinasEj4Tema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int oficinas [][] = new int [8][4];
    
        for(int i=0;i<8;i++){
           for(int j=0;j<4;j++){
               oficinas[i][j] = 0;
            }
        }
        
        
        //Llegada gente
            int piso = Lector.leerInt()-1;
                while(piso < 8){
                int ofi = Lector.leerInt()-1;
                oficinas[piso][ofi] = oficinas[piso][ofi] + 1;
                piso = Lector.leerInt()-1;
                }
                for(int i=0;i<8;i++){
           for(int j=0;j<4;j++){
               System.out.println("Personas en piso"+(i+1)+" oficina "+(j+1)+": "+oficinas[i][j]);
           }
        }
                    
        
    }
    
}
