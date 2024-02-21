import java.util.Scanner;
/*
Desarrollar un algoritmo que permita el ingreso de una letra,
correspondiente a un dígito del sistema de numeración romano. La
computadora muestra su correspondiente valor decimal. Si se ingresa una
letra inexistente, computadora informa que no existe tal dígito. Ejemplo:
Se ingresa 'D', la computadora muestra: 500.
* */
public class Ejercicio14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter;
        System.out.print("Ingrese una letra: ");
        caracter = scanner.nextLine().toUpperCase().charAt(0);
        switch (caracter) {
            case 'I':
                System.out.println("El caracter " + caracter + " vale 1");
                break;
            case 'V':
                System.out.println("El caracter " + caracter + " vale 5");
                break;
            case 'X':
                System.out.println("El caracter " + caracter + " vale 10");
                break;
            case 'L':
                System.out.println("El caracter " + caracter + " vale 50");
                break;
            case 'C':
                System.out.println("El caracter " + caracter + " vale 100");
                break;
            case 'D':
                System.out.println("El caracter " + caracter + " vale 500");
                break;
            case 'M':
                System.out.println("El caracter " + caracter + " vale 1000");
                break;
            default:
                System.out.println("No existe un digito con la letra " + caracter);
                break;
        }
        scanner.close();
    }
}
