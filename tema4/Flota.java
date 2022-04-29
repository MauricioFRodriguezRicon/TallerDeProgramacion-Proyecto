/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author usuario
 */
public class Flota {

private final Micro naves[] = new Micro[15];
private int cantMicros;


public Flota(){
    cantMicros = 0;
}

public boolean getLleno(){
return cantMicros == 15;
}

public void agregarMicro(Micro unMicro){
naves[cantMicros] = unMicro;
cantMicros +=1;
}

public Micro buscarMicro(String unDestino){
Micro aux = null;
for(int i=0;i<15;i++){
if(naves[i].getDestino().equals(unDestino)){
aux = naves[i];
}
}
return aux;
}


}
