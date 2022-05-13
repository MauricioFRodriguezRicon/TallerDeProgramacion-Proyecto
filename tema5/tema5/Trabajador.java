/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class Trabajador extends Persona{
    private String tarea;
    
    public Trabajador(){
    super();
    }
    
    public Trabajador(String nombre, int dni,int edad, String tarea){
    super(nombre,dni,edad);
    this.tarea = tarea;   
    }

    public String getTarea() {
        return tarea;
    }

    public void setTarea(String tarea) {
        this.tarea = tarea;
    }

    
    @Override
    public String toString(){
    String aux = super.toString() + " Soy " + getTarea();
    return aux;
    }



}
