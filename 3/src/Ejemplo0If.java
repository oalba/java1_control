 /*
 * Programa que pide una nota por teclado y muestra un mensaje si la nota es
 * mayor o igual que 5
 */
import java.util.*;
public class Ejemplo0If {
    public static void main( String[] args ){
        Scanner sc = new Scanner( System.in );
        System.out.print("Nota: ");
        int nota = sc.nextInt();
        if (nota >= 5 ){ //abre un if en el que entra cuando el numero introducido es igual o mayor que 5
            System.out.println("Enorabuena!!"); //muestra la linea en pantalla cuando entra en el if
            System.out.println("Has aprobado"); //muestra la linea en pantalla cuando entra en el if
        }
    }
}
