 /*
 * Programa que muestra un saludo distinto según la hora introducida
 */
import java.util.*;
public class Ejemplo2If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int hora;
      System.out.println("Introduzca una hora (un valor entero): ");
      hora = sc.nextInt();
      if (hora >= 0 && hora < 12) //si el numero introducido es igual o mayor que 0 Y es menor que 12, entra en el if
          System.out.println("Buenos días");
      else if (hora >= 12 && hora < 21) //si el numero introducido es igual o mayor que 12 Y es menor que 21, entra en el if
           System.out.println("Buenas tardes");
      else if (hora >= 21 && hora < 24) //si el numero introducido es igual o mayor que 21 Y es menor que 24, entra en el if
            System.out.println("Buenas noches");
      else //si el numero introducido es menor que 0 o es mayor que 24, entra en el else
            System.out.println("Hora no válida");
    }
}
