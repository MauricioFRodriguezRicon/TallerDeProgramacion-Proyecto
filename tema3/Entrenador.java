/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema3;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class Entrenador {
    private String nombre;
    private double sueldo;
    private double antiguedad;
    private double campeonato;
    
    public Entrenador(String nombre,double sueldo,double antiguedad,double campeonato){
    this.nombre = nombre;
    this.sueldo = sueldo;
    this.antiguedad = antiguedad;
    this.campeonato = campeonato;
    }
    
    public Entrenador(){
    }
    
    
    public void setNombre(String unNombre){
        nombre=unNombre;
    }
    public String getNombre(){
        return nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public double getCampeonato() {
        return campeonato;
    }

    public void setCampeonato(int campeonato) {
        this.campeonato = campeonato;
    }
    
    public double calcularEfectividad(){
        return campeonato/antiguedad;
    }
    
    public double calcularSueldoACobrar(){
    double aux = sueldo + ((sueldo*0.10)*antiguedad);
    if(campeonato > 0 && campeonato < 5){
        aux += 5000;
        } else if(campeonato > 4 && campeonato < 11){
            aux+=30000;
            } else if(campeonato > 10){
                aux+=50000;
                }
    return aux;
    }
    
}
