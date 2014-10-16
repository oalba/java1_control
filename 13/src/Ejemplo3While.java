 /*
 * programa que muestra una tabla de equivalencias entre
 * grados Fahrenheit y grados celsius
 */
public class Ejemplo3While {
    public static void main(String[] args) {
	//define tres constantes
        final int VALOR_INICIAL = 10;  // limite inf. tabla
        final int VALOR_FINAL = 100;  // limite sup. tabla
        final int PASO = 10 ; // incremento
	//define dos variables
        int fahrenheit;
        double celsius;
	//a la variable fahrenheit se le da el valor de la variable VALOR_INICIAL
        fahrenheit = VALOR_INICIAL;
        System.out.printf("Fahrenheit \t Celsius \n");
	//cuando la variable farhenheit es igual o menor que la variable VALOR_FINAL, entra en el while.
        while (fahrenheit <= VALOR_FINAL ){
	       //hace los calculos de fahrenheit a celsius
               celsius = 5*(fahrenheit - 32)/9.0;
               System.out.printf("%7d \t %8.3f \n", fahrenheit, celsius);
               fahrenheit += PASO;
        }
    }
}
