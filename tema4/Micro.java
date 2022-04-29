/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author usuario
 */
public class Micro {
    private String patente;
    private String destino;
    private String horaSalida;
    private final boolean asientos [] = new boolean [20];
    private int cantOcu = 0;
    
    public Micro(String patente,String destino,String horaSalida){
    this.patente = patente;
    this.destino = destino;
    this.horaSalida = horaSalida;
    
    }
    
    public void setPatente(String patente){
    this.patente = patente;
    }
    
    public void setDestino(String destino){
    this.destino = destino;
    }
    
    public void setHoraSalida(String horaSalida){
    this.horaSalida = horaSalida;
    }
    
    public String getPatente(){
    return patente;
    }
    
    public String getDestino(){
    return destino;
    }
        
    public String getHoraSalida(){
    return horaSalida;
    }
    
    public int getAsientosOcu(){
    return cantOcu;
    }

    public boolean getLleno(){
    return cantOcu == 20;
    }

    public boolean valido(int unAsiento){
    return (unAsiento>=0 && unAsiento<20);
    }

    public boolean getAsiento(int unAsiento){
    return asientos[unAsiento];
    }
    
    public void OcuparAsiento(int unAsiento){
    asientos[unAsiento] = true;
    cantOcu +=1;
    }
    
    
    public void LiberarAsiento(int unAsiento){
    asientos[unAsiento]=false;
    cantOcu -=1;
    }
    
    public int PrimerLibre(){
    int aux = -1;
        for (int i=0; i<20;i++){
            if(asientos[i] == false){
            aux = i;
        }
    }
    return aux;
    }
}
