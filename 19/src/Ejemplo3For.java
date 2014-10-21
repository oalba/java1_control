
/*
 * programa que muestra el valor de a, b y su suma mientras que la suma de
 * ambas es menor de 10. En cada iteración el valor de a se incrementa en
 * 1 unidad y el de b en 2
 */
public class Ejemplo3For {
    public static void main(String[] args) {
        int a, b;
	//Se les asigna un valor inicial de 1 a las variables a y b. Entra en el bucle siempre que la suma entre a y b sea menor que 10. Siempre que entre en el bucle a se le suma a+1 y a b b+2
	for(a = 1, b = 1; a + b < 10; a++, b+=2){
            System.out.println("a = " + a + "  b = " + b + "  a + b = " + (a+b));
        }
    }
}

