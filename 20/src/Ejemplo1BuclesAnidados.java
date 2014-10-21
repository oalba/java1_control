 /*
 * Programa que dibuja un rectángulo sólido de asteriscos.
 * El número de filas y columnas se pide por teclado
 */
import java.util.*;
public class Ejemplo1BuclesAnidados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int filas, columnas;
        //leer número de filas hasta que sea un número > 0
	//crea un bucle para solicitar un numero y entra en el siempre que el numero sea menor que 1
        do{
           System.out.print("Introduce número de filas: ");
           filas = sc.nextInt();
        }while(filas<1);
        //leer número de columnas hasta que sea un número > 0
	//crea otro bucle para solicitar otro numero y entra en el siempre que el numero sea menor que 1
        do{
           System.out.print("Introduce número de columnas: ");
           columnas = sc.nextInt();
        }while(columnas<1);
	//crea un bucle en el que entrara hasta que la variable i sea mayor que el primer numero introducido.
        for(int i = 1; i<=filas; i++){    //filas
	    //crea otro bucle en el que entrara hasta que la variable j sea mayor que el segundo numero introducido.
            for(int j = 1; j<=columnas; j++){   //columnas
                 System.out.print(" * ");
            }
	    //imprime una linea en blanco para que pase a la siguiente linea.
            System.out.println();
        }
       
    }
}
