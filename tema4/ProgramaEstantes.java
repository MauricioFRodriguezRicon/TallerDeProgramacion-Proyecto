/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tema4;
import PaqueteLectura.Lector;
/**
 *
 * @author usuario
 */
public class ProgramaEstantes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Estante librero = new Estante();
    
    
    //Lee el nombre de autor
    System.out.println("Introducir el nombre del autor");
    String aNombre = Lector.leerString();
    //Evalua que sea diferente de ZZZ
    while(!aNombre.equals("ZZZ")&& !librero.getLleno()){
        //Instancia autor
        Autor a = new Autor(aNombre,"ZZZ","XXX");
        
        //Lee los datos del libro
        System.out.println("Introducir el nombre del libro");
        String lNombre = Lector.leerString();
        System.out.println("Introducir la editorial");
        String editorial = Lector.leerString();
        System.out.println("Introducir el año de edicion");
        int añoEdicion = Lector.leerInt();
        System.out.println("Introducir el ISBN");
        String ISBN = Lector.leerString();
        System.out.println("Introducir el precio");
        double precio = Lector.leerDouble();
        
        //Instancia el libro
        Libro l = new Libro(lNombre,editorial,añoEdicion,a,ISBN,precio);
        
        //Agrega el libro al estante
        librero.agregarLibro(l);
        
        //Vuelve a leer el nombre del autor para volver al while
        System.out.println("Introducir el nombre del autor");
        aNombre = Lector.leerString();
    
    }
    
    System.out.println("El autor del libro Mujercitas es: " + librero.buscarLibro("Mujercitas").getPrimerAutor().getNombre());
        
    
    }
    
}
