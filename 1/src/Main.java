 /* Programa que lea dos números por teclado y los muestre por pantalla.
 */
//importa todas las clases del paquete java.util
import java.util.*;

//abre la clase principal
public class Main {
	//indica el inicio del programa
    public static void main(String[] args){
        //declaración de variables
        int n1, n2;
        Scanner sc = new Scanner(System.in);
        //leer el primer número
        System.out.println("Introduce un número entero: ");
        n1 = sc.nextInt();      //lee un entero por teclado
        //leer el segundo número
        System.out.println("Introduce otro número entero: ");
        n2 = sc.nextInt();      //lee un entero por teclado
       
        //mostrar resultado
        System.out.println("Ha introducido los números: " + n1 + " y " + n2);
    }
}
