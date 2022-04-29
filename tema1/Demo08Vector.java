/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;
import PaqueteLectura.GeneradorAleatorio;

/**
 *
 * @author Victoria
 */
public class Demo08Vector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        System.out.println("2x" + "5" + "="+ tabla2[5]);

        
        
        
        
        
        GeneradorAleatorio.iniciar();
        int num = GeneradorAleatorio.generarInt(12);
        while(num != 11){
        System.out.print("2x"+ num + "="+ tabla2[num]);
        System.out.println();
        num= GeneradorAleatorio.generarInt(12);
        
        }
    }
    
}
