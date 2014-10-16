
/*
 * Programa que pide un número de mes y muestra el nombre correspondiente
 */
import java.util.*;
public class Ejemplo0Switch {
    public static void main(String[] args) {
        int mes;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un numero de mes: ");
        mes = sc.nextInt();
        switch (mes) //cuando introduces un numero, entra en el switch y dependiendo del numero introducido, mostrara una linea u otra.
        {
                case 1: System.out.println("ENERO"); //si el numero introducido el 1, muestra ENERO
                           break; //aqui sale del switch
                case 2: System.out.println("FEBRERO"); //si el numero introducido el 2, muestra FEBRERO
                           break; //aqui sale del switch
                case 3: System.out.println("MARZO"); //si el numero introducido el 3, muestra MARZO
                           break; //aqui sale del switch
                case 4: System.out.println("ABRIL"); //si el numero introducido el 4, muestra ABRIL
                           break; //aqui sale del switch
                case 5: System.out.println("MAYO"); //si el numero introducido el 5, muestra MAYO
                           break; //aqui sale del switch
                case 6: System.out.println("JUNIO"); //si el numero introducido el 6, muestra JUNIO
                           break; //aqui sale del switch
                case 7: System.out.println("JULIO"); //si el numero introducido el 7, muestra JULIO
                           break; //aqui sale del switch
                case 8: System.out.println("AGOSTO"); //si el numero introducido el 8, muestra AGOSTO
                           break; //aqui sale del switch
                case 9: System.out.println("SEPTIEMBRE"); //si el numero introducido el 9, muestra SEPTIEMBRE
                           break; //aqui sale del switch
                case 10: System.out.println("OCTUBRE"); //si el numero introducido el 10, muestra OCTUBRE
                             break; //aqui sale del switch
                case 11: System.out.println("NOVIEMBRE"); //si el numero introducido el 11, muestra NOVIEMBRE
                             break; //aqui sale del switch
                case 12: System.out.println("DICIEMBRE"); //si el numero introducido el 12, muestra DICIEMBRE
                             break; //aqui sale del switch
                default : System.out.println("Mes no válido"); //si el numero introducido no coincide con ninguna de las opciones anteriores, muestra "Mes no válido"
        }
    }
}

