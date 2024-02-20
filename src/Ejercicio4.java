/*
*Ingresar por teclado el diámetro (tipo de dato entero) de un círculo y
calcular su perímetro pero sólo deberá mostrar la parte entera del
resultado. Defina el valor de PI como una constante con valor 3,14.
Ejemplo: Ingresa 10, debe devolver perímetro = 31. Realice Casting
para obtener la parte entera del resultado.
 */
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double PI = 3.14;
        int diametro;
        int perimetro;
        System.out.print("Ingrese el valor del diametro: ");
        diametro = Integer.parseInt(scanner.nextLine());
        perimetro = (int)(diametro * PI);
        System.out.println("El resultado del perimetro es: " + perimetro);
        scanner.close();
    }
}
