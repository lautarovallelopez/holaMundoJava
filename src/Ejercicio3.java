/*
* Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado. La computadora deberá mostrar su cociente con decimales.
Recuerde utilizar Casting para obtener el resultado con los decimales
correspondientes.
* */
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ingrese valor 1: ");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese valor 2: ");
        numero2 = Integer.parseInt(scanner.nextLine());
        double resultado = numero1 / (double)numero2;
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
