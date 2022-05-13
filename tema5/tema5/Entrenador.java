/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
t */
public class Entrenador extends Empleado {
    
    double cantCampeonatos;
    
    public Entrenador(){
    super();
    }
    
    public Entrenador(String nombre, double sueldoBasico, int antiguedad, double cantCampeonatos){
        super(nombre,sueldoBasico,antiguedad);
        this.cantCampeonatos = cantCampeonatos;

    }

    public double getCantCampeonatos() {
        return cantCampeonatos;
    }

    public void setCantCampeonatos(double cantCampeonatos) {
        this.cantCampeonatos = cantCampeonatos;
    }


    @Override
    public double calcularEfectividad(){
    return getCantCampeonatos()/getAntiguedad();
    }

    @Override
    public double calcularSueldoACobrar(){
    double aux = getSueldoBasico() + (getSueldoBasico()*(0.10*getAntiguedad()));    
    if(getCantCampeonatos() > 0){
        if(getCantCampeonatos() < 5){
            aux+=5000;
        } else if(getCantCampeonatos()<11){
            aux+=30000;
        } else {
            aux+= 50000;
        }
    }                
    return aux;
}
}
