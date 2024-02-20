/*
* Ingresar el área de un cuadrado por teclado utilizando un objeto Scanner.
Calcular e imprimir el valor del perímetro. Ejemplo: Ingresa 25, debe
devolver 20.
* */
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese en area del cuadrado: ");
        double area = Double.parseDouble(scanner.nextLine());
        double lado = Math.sqrt(area);
        double perimetro = lado * 4;
        System.out.println("El perimetro es: " + perimetro);
        scanner.close();
    }
}
