/*
*  Desarrollar un algoritmo que permita ingresar dos números enteros por
teclado utilizando un objeto Scanner. La computadora deberá mostrar su
cociente entero. El resto se deberá mostrar en otra línea. Ejemplo:
Ingresa 23 y 5, debe devolver 4 y, en otra línea, 3.
*/
import java.util.Scanner;

public class Ejercicio02 {
    public static  void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numerador;
        int denominador;
        int cocienteEntero;
        int resto;
        System.out.print("Ingrese valor 1: ");
        numerador = Integer.parseInt(scanner.nextLine());
        System.out.print("\nIngrese valor2: ");
        denominador = Integer.parseInt(scanner.nextLine());
        cocienteEntero = numerador / denominador;
        resto = numerador % denominador;
        System.out.println("\nLa parte entera es " + cocienteEntero + " y el resto es " + resto);
        scanner.close();
    }
}
