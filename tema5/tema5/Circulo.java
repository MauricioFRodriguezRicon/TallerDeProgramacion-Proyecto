/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class Circulo extends Figura{
    double radio;

    
    public Circulo(){
    }   
    
    public Circulo(String CR,String CL,double radio){
        super(CR,CL);
        this.radio=radio;
    }    

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
    @Override
    public double calcularPerimetro(){
        return 2*Math.PI*radio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*(radio*radio);
    }    
    
    
}




