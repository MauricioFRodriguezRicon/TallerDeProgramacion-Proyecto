
package tema1;

//Paso 1: Importar la funcionalidad para lectura de datos
import PaqueteLectura.Lector;

public class Ej02Jugadores {

  
    public static void main(String[] args) {
        //Paso 2: Declarar la variable vector de double 
        int DF = 15;
        
        //Paso 3: Crear el vector para 15 double 
        double [] vecAlt = new double [DF];
        //Paso 4: Declarar indice y variables auxiliares a usar
        double suma = 0;
        double promedio;
        int cant = 0;
        //Paso 6: Ingresar 15 numeros (altura), cargarlos en el vector, ir calculando la suma de alturas
        for (int i=0;i<15;i++){
            System.out.println("Introducir altura");
            vecAlt[i] = Lector.leerDouble();
            suma = suma + vecAlt[i];
        }
        //Paso 7: Calcular el promedio de alturas, informarlo
        promedio = suma / DF;
        System.out.println("Promedio: "+ promedio);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for(int i=0;i<15;i++){
            if(vecAlt[i]>= promedio){
            cant++;
            }
        }
        
        
        
        //Paso 9: Informar la cantidad.
        System.out.print(cant);
    }
    
}
