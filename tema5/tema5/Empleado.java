/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public abstract class Empleado {
private String nombre;
private double sueldoBasico;
private int antiguedad;

public Empleado(){
}

public Empleado(String nombre,double sueldoBasico,int antiguedad){
this.nombre = nombre;
this.sueldoBasico = sueldoBasico;
this.antiguedad = antiguedad;
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoBasico() {
        return sueldoBasico;
    }

    public void setSueldoBasico(double sueldoBasico) {
        this.sueldoBasico = sueldoBasico;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }


    public abstract double calcularEfectividad();
    public abstract double calcularSueldoACobrar();
    
@Override
    public String toString(){
    String aux ="Nombre: " + getNombre() + " " +
            "Sueldo a cobrar: " + this.calcularSueldoACobrar() + " " + 
            "Efectividad: " + this.calcularEfectividad();
    return aux;
    }
}
