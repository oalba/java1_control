 /*
 * programa que pide un número por teclado y calcula si es par o impar
 */
import java.util.*;
public class EjemploIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
        if ((num%2)==0) //divide el numero introducido entre dos y comprueba que el resto sea 0. De ser asi, entra en el if.
           System.out.println("PAR");
        else //cuando el resto no es 0, entra en el else
            System.out.println("IMPAR");
    }
}
