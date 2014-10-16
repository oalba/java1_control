 /*
 * Programa que lee números hasta que se lee un negativo y muestra la
 * suma de los números leídos
 */
import java.util.*;
public class Ejemplo1While {
    public static void main(String[] args) {
        int suma = 0, num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        num = sc.nextInt();
	//entra en el while siempre que el numero introducido sea 0 o mayor. Siempre que entre en el while, metera en la variable suma, el valor que tenia anteriormente y le suma el numero introducido. Despues de hacerlo, vuelve a pedir un numero hasta que el numero introducido sea negativo y salga del while.
        while (num >= 0){
               suma = suma + num;
               System.out.print("Introduzca un número: ");
               num = sc.nextInt();
        }
	//cuando sale del while, muestra la suma de todos los numeros introducidos.
        System.out.println("La suma es: " + suma );
    }
}
