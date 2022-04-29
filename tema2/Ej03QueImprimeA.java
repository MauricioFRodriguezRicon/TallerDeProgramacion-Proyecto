
package tema2;

/**
 *
 * @author vsanz
 */
public class Ej03QueImprimeA {
    public static void main(String[] args) {
        String saludo1=new String("hola"); //Se genera un objeto Hola
        String saludo2=new String("hola"); //Se genera un segundo objeto hola
        System.out.println(saludo1 == saludo2); //Da false porque son objetos diferentes aunque posean el mismo contenido
        System.out.println(saludo1 != saludo2); //Da true porque son objetos diferentes aunque posean el mismo contenido
        System.out.println(saludo1.equals(saludo2));    //Da true porque a pesar de ser objetos diferentes el contenido es el mismo
    } 
}
