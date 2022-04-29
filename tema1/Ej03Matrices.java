/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;


public class Ej03Matrices {

    public static void main(String[] args) {
	//Paso 2. iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //Paso 3. definir la matriz de enteros de tamaño 10x10 e iniciarla con nros. aleatorio
        int matNum [][] = new int [10][10];
      
     
        
        
       for(int i=0;i<10;i++){
          for (int j=0; j<10; j++){
           matNum[i][j]=GeneradorAleatorio.generarInt(201);
    }
    }
        //Paso 4. mostrar el contenido de la matriz en consola
    for(int i=0;i<10;i++){
          for (int j=0; j<10; j++){
              System.out.println(matNum[i][j]);
    }
    }
        //Paso 5. calcular e informar la suma de todos los elementos almacenados entre las filas 2 y 9 y las columnas 0 y 3
    
    int total=0;
    
    for(int i=2;i<10;i++){
        for(int j=0;j<4;j++){
        total=total+matNum[i][j];
        }
        System.out.println("Total en fila "+ i + ": "+total);
    }
        //Paso 6. generar un vector de 10 posiciones donde cada posición i contiene la suma de la columna i de la matriz 
	//   luego de generado, imprimir el vector
        int vector [] = new int [10];
        int suma;
        for(int i=0;i<10;i++){
            suma = 0;
            for(int j=0;j<10;j++){
            suma=suma+matNum[i][j];
            }
            vector[i]=suma;
        }
        //Paso 7. lea un valor entero e indique si se encuentra o no en la matriz. En caso de encontrarse indique su ubicación (fila y columna)
        //   y en caso contrario imprima "No se encontró el elemento".
        int valor = Lector.leerInt();
        boolean encontrado = false;
        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(matNum[i][j] == valor){
            encontrado = true;
            System.out.println("Se encontro en " + i +" "+ j);
            j=10;
            i=10;
            }
                if(encontrado == false){
                System.out.println("No se encontro el elemento");
                }
            }
        }
    }
}


