import java.util.Scanner;
/*
* )Desarrollar un algoritmo que permita ingresar un caracter. La
computadora indica si es o no una letra vocal (utilice switch-case)
* */
public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char caracter;
        System.out.print("Ingrese un caracter: ");
        caracter = scanner.nextLine().toUpperCase().charAt(0);
        switch (caracter) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
                System.out.println("El caracter " + caracter + " es vocal.");
                break;
            default:
                System.out.println("El caracter " + caracter + " no es vocal.");
        }
        scanner.close();
    }
}
