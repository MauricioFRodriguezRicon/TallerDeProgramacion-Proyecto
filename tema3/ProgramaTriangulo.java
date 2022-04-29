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
public class ProgramaTriangulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
        double l1 = Lector.leerDouble();
        double l2 = Lector.leerDouble();
        double l3 = Lector.leerDouble();
        String colorR = Lector.leerString();
        String colorL = Lector.leerString();
        
        
        Triangulo figura = new Triangulo(l1,l2,l3,colorR,colorL);
        
        
        /*figura.setLado1(l1);
        figura.setLado2(l2);
        figura.setLado3(l3);
        figura.setColorLinea("Rojo");
        figura.setColorRelleno("Verde");
        */
        
        double area = figura.calcularArea();
        double perimetro = figura.calcularPerimetro();
        System.out.println("Area: "+ area +" Perimetro: "+ perimetro);
    }
    
}
