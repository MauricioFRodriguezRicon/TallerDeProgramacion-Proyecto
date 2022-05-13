/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema5;

/**
 *
 * @author usuario
 */
public class Triangulo extends Figura{
    double l1;
    double l2;
    double l3;
    
    public Triangulo(){
    }
    
    public Triangulo(String CR,String CL,double l1,double l2,double l3){
    super(CR,CL);
    this.l1 = l1;
    this.l2 = l2;
    this.l3 = l3;
    }

    public double getL1() {
        return l1;
    }

    public void setL1(double l1) {
        this.l1 = l1;
    }

    public double getL2() {
        return l2;
    }

    public void setL2(double l2) {
        this.l2 = l2;
    }

    public double getL3() {
        return l3;
    }

    public void setL3(double l3) {
        this.l3 = l3;
    }
    
    @Override
    public double calcularArea(){
    double s = (getL1() + getL2() + getL3())/2;
    double aux = Math.sqrt((s*(s-getL1())*(s-getL2())*(s-getL3())));
    return aux;
    }
    
    
    @Override
    public double calcularPerimetro(){
    return getL1()+getL2()+getL3();
    }
}


