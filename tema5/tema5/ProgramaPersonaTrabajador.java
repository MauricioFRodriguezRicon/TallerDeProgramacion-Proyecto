/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class ProgramaPersonaTrabajador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona persi = new Persona("Juan",3232,24);
        
        Trabajador trabaji = new Trabajador("Pedro",3553,22,"Docente");
        
        System.out.println(persi.toString());
        System.out.println(trabaji.toString());
        
        
        
        
        
    }
    
}
