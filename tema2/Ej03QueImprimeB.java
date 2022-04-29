/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema2;

/**
 *
 * @author vsanz
 */
public class Ej03QueImprimeB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona p1; //Se reserva memoria
        Persona p2; //Se reserva memoria
        p1 = new Persona(); //Se crea p1
        p1.setNombre("Pablo Sotile");
        p1.setDNI(11200413);
        p1.setEdad(40);
        p2 = new Persona(); //Se crea p2
        p2.setNombre("Julio Toledo");
        p2.setDNI(22433516);
        p2.setEdad(51);
        p1 = p2;    //La referencia que apuntaba a p1 pasa a apuntar a p2; El objeto p1 termina por perderse
        p1.setEdad( p1.getEdad() + 1 ); //Suma 1 a la edad del objeto que apuntan p1 y p2
        System.out.println(p2.toString());  //Imprime "Mi nombre es Julio Toledo mi DNI es 22433516 y tengo 52 años"
        System.out.println(p1.toString());  //Imprime "Mi nombre es Julio Toledo mi DNI es 22433516 y tengo 52 años"
        System.out.println( (p1 == p2) );   //Imprime true porque ambos hacen referencia al mismo objeto
    }
    
}
