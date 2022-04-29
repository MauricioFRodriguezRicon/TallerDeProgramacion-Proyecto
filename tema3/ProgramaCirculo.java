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
public class ProgramaCirculo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
    
    
    double radio =Lector.leerDouble();
    String colorRelleno = Lector.leerString();
    String colorLinea =Lector.leerString();
    
    Circulo circu = new Circulo(radio,colorRelleno,colorLinea);
    
    
    System.out.println("Perimetro: " + circu.calcularPerimetro()+ " Area: "+circu.calcularArea());
    }
    
}
