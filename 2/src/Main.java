 /*
 * Programa que lee dos números de tipo double por teclado
 * y muestra su suma, resta y multiplicación.
 */
import java.util.*;
public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double numero1, numero2;
        System.out.println("Introduce el primer número:");
        numero1 = sc.nextDouble();
        System.out.println("Introduce el segundo número:");
        numero2 = sc.nextDouble();
        System.out.println("Números introducido: " + numero1 + "  " + numero2); //muestra en pantalla los numeros introducidos
        System.out.println
          (numero1 + " + " + numero2 + " = " + (numero1+numero2)); //muestra el calculo que se ha hecho y muestra el resultado
        System.out.println
          (numero1 + " - " + numero2 + " = " + (numero1-numero2)); //muestra el calculo que se ha hecho y muestra el resultado
        System.out.println
          (numero1 + " * " + numero2 + " = " + numero1*numero2); //muestra el calculo que se ha hecho y muestra el resultado
    }
}
