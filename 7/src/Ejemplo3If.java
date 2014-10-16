
/*
 * programa que lee una nota y escribe la calificación correspondiente
 */
import java.util.*;
public class Ejemplo3If {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      double nota;
      System.out.println("Introduzca una nota entre 0 y 10: ");
      nota = sc.nextDouble();
      System.out.println("La calificación del alumno es ");
      if(nota < 0 || nota > 10) //si el numero introducido es menor que 0 o mayor que 10, muestra la siguiente linea
         System.out.println("Nota no válida");
      else if(nota==10)//si el numero introducido es 10, muestra la siguiente linea
           System.out.println("Matrícula de Honor");
      else if (nota >= 9)//si el numero introducido es 9 o mayor, muestra la siguiente linea
           System.out.println("Sobresaliente");
      else if (nota >= 7)//si el numero introducido es 7 o mayor, muestra la siguiente linea
           System.out.println("Notable");
      else if (nota >= 6)//si el numero introducido es 6 o mayor, muestra la siguiente linea
           System.out.println("Bien");
      else if (nota >= 5)//si el numero introducido es 5 o mayor, muestra la siguiente linea
           System.out.println("Suficiente");
      else //si el numero introducido no cumple ninguna de las condiciones anteriores, muestra la siguiente linea
           System.out.println("Suspenso");
    }
}

