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
public class VectorPartidosEj6Pract2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Partido vector[] = new Partido[20];
        
        
        int i=0;
        String local = Lector.leerString();
        while(!local.equals("ZZZ") && i<20){
        String visitante = Lector.leerString();
        int golesLocal = Lector.leerInt();
        int golesVisitante = Lector.leerInt();
        vector[i] = new Partido(local,visitante,golesLocal,golesVisitante);
        i = i+1;
        local = Lector.leerString();
        }
        
        int ganoRiver = 0;
        int golesBoca = 0;
        double empate = 0;
        for(int j=0;j<i;j++){
        if(vector[j].hayEmpate()){
        empate = empate+1;
        } else {
       if(vector[j].getGanador().equals("River")){
       ganoRiver = ganoRiver+1;
       
       }
       
       if(vector[j].getLocal().equals("Boca")){
       golesBoca = golesBoca + vector[j].getGolesLocal();
       }
        
        
        }        }
        
        double porcentajeEmpate = (empate/i)*100;
        
        System.out.println("Gano River: "+ ganoRiver);
        System.out.println("Goles de Boca de local "+golesBoca);
        System.out.println("Porcentaje de empates %"+ porcentajeEmpate);}
    
    
    
    
    
    
    
    
    
    
    }   
  
