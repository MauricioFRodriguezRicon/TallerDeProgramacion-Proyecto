/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class Jugador extends Empleado {
   private double cantPartidos;
   private double golesMetidos;
    
    
    public Jugador(){
    super();
    }
    
    public Jugador(String nombre,double sueldoBasico,int antiguedad,int cantPartidos, int golesMetidos){
    super(nombre,sueldoBasico,antiguedad);
    this.cantPartidos = cantPartidos;
    this.golesMetidos = golesMetidos;
    }

    public double getCantPartidos() {
        return cantPartidos;
    }

    public void setCantPartidos(double cantPartidos) {
        this.cantPartidos = cantPartidos;
    }

    public double getGolesMetidos() {
        return golesMetidos;
    }

    public void setGolesMetidos(double golesMetidos) {
        this.golesMetidos = golesMetidos;
    }


@Override
public double calcularEfectividad(){
return getGolesMetidos()/getCantPartidos();
}

@Override
public double calcularSueldoACobrar(){
double aux = getSueldoBasico() + (getSueldoBasico()*(0.10*getAntiguedad()));
if(calcularEfectividad()>0.5){
aux += getSueldoBasico();
}
return aux;
}
    







}
