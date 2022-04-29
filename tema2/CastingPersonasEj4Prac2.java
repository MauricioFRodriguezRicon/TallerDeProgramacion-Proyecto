/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;
/**
 *
 * @author usuario
 */
public class CastingPersonasEj4Prac2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Persona vector[][] = new Persona[5][8];
        int dias[] = new int[5];
        
        String nombre = GeneradorAleatorio.generarString(3);
        
        int dia;
        for(dia=0;dia<5;dia++){
        int aux =0;
        while(!nombre.equals("ZZZ") && aux < 8){
        int edad = GeneradorAleatorio.generarInt(90);
        int dni = GeneradorAleatorio.generarInt(9999);
        vector[dia][aux] = new Persona();
        vector[dia][aux].setDNI(dni);
        vector[dia][aux].setEdad(edad);
        vector[dia][aux].setNombre(nombre);
        aux = aux+1;
        nombre = GeneradorAleatorio.generarString(3);
        }
        dias[dia] = aux;
        }
        
        for(int i=0;i<5;i++){
            for(int j=0;j<dias[i];j++){
            System.out.println("Dia: "+ i + " Turno: " + j + " Concursante: " + vector[i][j].toString());
            
            }
        
        
        }
    
    
    
    
    
    
    
    
    
    
    
    }
    
}
