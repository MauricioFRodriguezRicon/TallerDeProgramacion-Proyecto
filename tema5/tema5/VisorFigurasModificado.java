/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class VisorFigurasModificado {
 private int guardadas;
 private final int capacidadMaxima=5;
 private Figura [] vector;
 
 public VisorFigurasModificado(){
 vector = new Figura [capacidadMaxima];
 guardadas = 0;
 }
 
 public void guardar(Figura f){
     if(guardadas < capacidadMaxima){
        vector[guardadas] = f;
        guardadas +=1;
     }
 }

 public boolean quedaEspacio(){
 return guardadas<capacidadMaxima;
 }
 
 public void mostrar(){
 for(int i=0;i<guardadas;i++){
 System.out.println(vector[i].toString());
 }
 }
 public int getGuardadas() {
 return guardadas;
 }
 
} 
