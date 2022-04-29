/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class CrearPersonaEImprimir {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
    Persona Totoro = new Persona();
    
    String unNombre = Lector.leerString();
    int unDni = Lector.leerInt();
    int unaEdad = Lector.leerInt();
    
    
    Totoro.setNombre(unNombre);
    Totoro.setDNI(unDni);
    Totoro.setEdad(unaEdad);
    System.out.println(Totoro.toString());
    }
    
}
