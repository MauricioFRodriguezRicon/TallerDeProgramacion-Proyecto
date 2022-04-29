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
public class ProgramaEntrenador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
            System.out.println("ingrese datos");
            
            System.out.println("ingrese nombre");
            String unNombre = Lector.leerString();
            System.out.println("ingrese sueldo basico");
            double unSueldoBasico = Lector.leerDouble();
            System.out.println("ingrese antiguedad");
            double unAntiguedad = Lector.leerInt();
            System.out.println("ingrese campeonatos ganados");
            double unaCantidad = Lector.leerInt();
            
            Entrenador entreni = new Entrenador(unNombre,unSueldoBasico,unAntiguedad,unaCantidad);
            
           /* entreni.setAntiguedad(unAntiguedad);
            entreni.setCampeonato(unaCantidad);
            entreni.setNombre(unNombre);
            entreni.setSueldo(unSueldoBasico);
            */
            
            System.out.println("Sueldo a cobrar: "+ entreni.calcularSueldoACobrar());
            System.out.println("Efectividad: " + entreni.calcularEfectividad()*100 + "%");
            
            
            
            
    }
    
}
