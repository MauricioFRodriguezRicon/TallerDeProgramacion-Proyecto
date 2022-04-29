/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema2;
import PaqueteLectura.GeneradorAleatorio;



public class Ej2Prac2VecObj {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona vector[] = new Persona[15];
        int aux = 0;
        int edad;
        String nombre;
        int dni;
        
        
        edad = GeneradorAleatorio.generarInt(2);
        
        while(edad != 0 && aux<15){
        nombre = GeneradorAleatorio.generarString(10);
        dni = GeneradorAleatorio.generarInt(999999);
        
        vector[aux] = new Persona();
        vector[aux].setNombre(nombre);
        vector[aux].setEdad(edad);
        vector[aux].setDNI(dni);
        
        aux = aux+1;
        
        
        edad = GeneradorAleatorio.generarInt(10000);
    }
    
        
        for(int i=0; i<aux;i++){
        System.out.println(vector[i].toString());
        
        }

        
        
        int mayores65 = 0;
        int menorDni = 9999999;
        Persona conMenorDni = new Persona();
        for (int i=0; i<aux;i++){
            if(vector[i].getEdad()>65){
                mayores65=mayores65+1;
            }
            if(vector[i].getDNI()<menorDni){
            menorDni = vector[i].getDNI();
            conMenorDni = vector[i];
            }
        }
        System.out.println("MAYORES DE 65");
        System.out.println(mayores65);
        System.out.println("PERSONA CON MENOR DNI");
        System.out.println(conMenorDni.toString());
    }
}