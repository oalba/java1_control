 /*
 * programa que lee un número n y muestra n asteriscos
 */
import java.util.*;
public class Ejemplo2While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, contador = 0;
        System.out.print("Introduce un número: ");
        n = sc.nextInt();
	//entra en el while siempre que la variable contador sea mas pequeña que el numero introducido. Cada vez que entra en la variable, muestra un * y suma 1 a la variable contador.
        while (contador < n){
               System.out.println(" * ");
               contador++;
        }
    }
}
