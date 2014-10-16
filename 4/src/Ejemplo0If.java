 /*
 * Programa que pide una nota por teclado y muestra si se ha aprobado o no
 */
import java.util.*;
public class Ejemplo0If {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        if (nota >= 5 ){ //cuando se cumple la siguiente condicion, muestra las siguientes lineas entrando en el if
            System.out.println("Enorabuena!!");
            System.out.println("Has aprobado");
        }
        else //cuando la condicion no se cumple, muestra la siguiente linea entrando en el else
            System.out.println("Lo Siento, has suspendido");
    }
}
