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
public class ProgramaMicro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Inicializa un micro patente ABC123,con dentino Mar del plata que sale a las 5 am
        Micro costera = new Micro("ABC123","Mar del Plata","05:00");
        int asiento;
        //Bucle de 5 
        for(int i=0;i<5;i++){
        System.out.println("Incertar su asiento");
        asiento = Lector.leerInt();
        //Valida el asiento
        if(costera.valido(asiento)){
            //Si es valido y esta vacio lo ocupa
            if(!costera.getAsiento(asiento)){
                costera.OcuparAsiento(asiento);
                System.out.println("Se ocupo con exito el asiento nro: "+asiento);
            }
            //Si es valido pero esta ocupado informa que esta ocupado e informa el primer asiento valido
            else {
                System.out.println("Lo sentimos el asiento esta ocupado, pero el primer asiento disponible es: "+ costera.PrimerLibre());
            }
        }
        
        }
        //Informa la cantidad de asientos ocupados
        System.out.println("Asientos ocupados: "+ costera.getAsientosOcu());



    }
    
}
