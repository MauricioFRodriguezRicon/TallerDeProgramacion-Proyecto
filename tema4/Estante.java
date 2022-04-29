/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tema4;

/**
 *
 * @author usuario
 */
public class Estante {
    
    /* Si se quisiera iniciar un estante con N libros como maximo 
       Se deberia declarar "new Libro[N]"
       Y en el constructor tomar un numero que sea N para inicializar el estante*/
    
        /*public Estante(int N){
        estante = new Libro[N];
        }*/
    
    
    private final Libro estante [] = new Libro [20];
    private int cantAlm;

public Estante(){
}

public int getCantAlm(){
return cantAlm;
}

public boolean getLleno(){
return cantAlm == 20;
}

public void agregarLibro(Libro unLibro){
estante[cantAlm] = unLibro;
cantAlm += 1;
}

public Libro buscarLibro(String unTitulo){
    Libro aux = null;
for (int i=0;i<20; i++){
if(estante[i].getTitulo().equals(unTitulo)){
aux = estante[i];
i=20;
}
}
return aux;
}

}


