 /*
 * Programa que obliga al usuario a introducir un número menor que 100
 */
import java.util.*;
public class Ejemplo1DoWhile {
    public static void main(String[] args) {
        int valor;
        Scanner in = new Scanner( System.in );
	//Esta estructura es la misma que tiene el while, solo que el orden es al reves.
	//primero indica las ordenes que se van ejecutar con el do
        do {
            System.out.print("Escribe un entero < 100: ");
            valor = in.nextInt();
	//despues indica las condiciones con las que se van a ejecutar las lineas anteriores.
        }while (valor >= 100);
	//esta ultima linea no tiene nada que ver con el while.
        System.out.println("Ha introducido: " + valor);
    }
}
