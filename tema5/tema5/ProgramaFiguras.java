/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class ProgramaFiguras {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Triangulo triagu = new Triangulo("ROJO","AZUL",2,3,4);
        Circulo circu = new Circulo("VERDE","VIOLETA",9.2);
        
        System.out.println(circu.toString());
        
        System.out.println(triagu.toString());
        
        
        
        
        circu.Despintar();
        
        triagu.Despintar();
        
        System.out.println(circu.toString());
System.out.println(triagu.toString());





    }
    
}
