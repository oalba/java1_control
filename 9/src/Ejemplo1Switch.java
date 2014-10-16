
/*
 * Programa que pide dos números y un operador y muestra el resultado
 */
import java.util.*;
import java.io.*;
public class Ejemplo1Switch {
    //throws IOException se usa cuando quieres capturar un error producido por Entrada o Salida de datos
    public static void main(String[] args) throws IOException{
	//define las variables
        int A,B, Resultado = 0 ;
        char operador;
        boolean calculado = true;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero entero:");
        A = sc.nextInt();
        System.out.print("Introduzca otro numero entero:");
        B = sc.nextInt();
        System.out.print("Introduzca un operador (+,-,*,/):");
	//mete el operador introducido en una variable de tipo char, para luego poder compararlo
        operador = (char)System.in.read();
	//el switch, dependiendo del operador introducido, mete en la variable resultado una cosa u otra (calculos entre los dos numeros).
        switch (operador) {
                case '-' : Resultado = A - B;
                           break;
                case '+' : Resultado = A + B;
                           break;
                case '*' : Resultado = A * B;
                           break;
		//en el caso de que la variable operador sea /, crea un if comprobando que el segundo numero introducido (B) no sea 0. Si no es 0, el calculo de los dos numeros entra en la variable resultado. Si no es 0, se muestra una linea de error y se le da el valor false a la variable calculado.
                case '/' : if(B!=0)
                              Resultado = A / B;
                           else{
                              System.out.println("\nNo se puede dividir por cero");
                              calculado = false;
                           }
                           break;
		//Si el operador introducido no coincide con ninguna de las opciones, se muestra una linea de error y se le da el valor false a la variable calculado.
                default : System.out.println("\nOperador no valido");
                          calculado = false;
                         
        }
	//si la variable calculado existe (o es true), entra en el if y muestra la variable resultado. Si la variable calculado no existe (o es false), termina el programa.
        if(calculado){
            System.out.println("\nEl resultado es: " + Resultado);
        }
    }
}

