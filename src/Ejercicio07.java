import java.util.Scanner;

/*
* Codifique un programa en Java que permita saber si un número ingresado
por teclado es par o impar.
* */
public class Ejercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numeroIngresado;
        System.out.print("ingrese numero: ");
        numeroIngresado = Integer.parseInt(scanner.nextLine());
        if(numeroIngresado % 2 == 0) {
            System.out.println("El numero es par");
        } else {
            System.out.println("El numero es impar");
        }
    }
}
