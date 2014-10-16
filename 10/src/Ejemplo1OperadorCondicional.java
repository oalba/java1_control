/*
  * programa que pide un número por teclado y calcula si es par o impar
  */
import java.util.*;
public class Ejemplo1OperadorCondicional {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;      
        System.out.println("Introduzca numero: ");
        num = sc.nextInt();
	//en este caso, en la misma linea de salida hay una condicion, primero se calcula si el resto del numero introducido entre 2 es 0. De ser asi, la respuesta es true y muestra PAR, ya que ? significa true. Si el resto no es 0, la respuesta es false y muestra IMPAR, ya que : significa false.
        System.out.println((num%2)==0 ? "PAR" : "IMPAR");
    }
}
