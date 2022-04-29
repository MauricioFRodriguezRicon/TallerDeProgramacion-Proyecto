/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class ProgramaFlota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 //Inicializa la flota
    Flota Oeste = new Flota();
    
    //Declara las variables y toma el primer destino para entrar al while
    System.out.println("Incertar un destino");
    String unDestino = Lector.leerString();
    String unaPatente;
    String unaHora;
    
    //Siempre que el destino sea diferente de ZZZ y la flota no este llena se mantiene en el while
    while (!unDestino.equals("ZZZ") && !Oeste.getLleno()){
    //Toma el resto de los datos para el micro    
    System.out.println("Incertar patente");
    unaPatente = Lector.leerString();
    System.out.println("Incertar una hora de salida");
    unaHora = Lector.leerString();
    
    //Inicializa el micro y lo agrega a la flota
    Micro m = new Micro(unaPatente,unDestino,unaHora);
    Oeste.agregarMicro(m);
    }
    
    //Toma un destino a buscar en la flota
    System.out.println("Incertar un destino a buscar");
    unDestino = Lector.leerString();
    //Busca si existe un micro con el mismo destino
    if(Oeste.buscarMicro(unDestino) != null){
    System.out.println("Existe un micro con el mismo destino");
    }
    }
    
    
    
    
    
    
    }
    

