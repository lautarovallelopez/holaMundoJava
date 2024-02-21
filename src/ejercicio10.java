import java.util.Scanner;
/*
* Desarrollar un algoritmo que, dados dos números enteros entre 0 y 100,
la computadora indique si el mayor es divisible por el menor. Ejemplo:
Ingresa 4 y 28, debe imprimir “28 es divisible por 4”. Se deberá validar
que los números ingresados se encuentren entre 0 y 100.
* */
public class ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.print("Ingrese numero 1: ");
        numero1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese numero 2: ");
        numero2 = Integer.parseInt(scanner.nextLine());
        int mayor = Math.max(numero1, numero2);
        int menor = Math.min(numero1, numero2);

        if (mayor % menor == 0) {
            System.out.print(mayor + " es divisible por " + menor);
        } else {
            System.out.print(mayor + " no es divisible por " + menor);
        }
        scanner.close();
    }
}
