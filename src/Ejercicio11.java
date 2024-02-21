import java.util.Scanner;
/*
* )Desarrollar un algoritmo que permita ingresar los lados A, B y C de un
triángulo. La computadora informa si el triángulo es o no válido. En caso
afirmativo, además informa si es equilátero, isósceles o escaleno. Ayuda:
según el teorema de desigualdad triangular, un triángulo es válido si se
cumple que cada uno de los lados no puede ser más largo que la suma
de los otros dos. Un triángulo equilátero es aquel que tiene sus tres lados
iguales. Un triángulo isósceles es aquel que tiene dos de sus lados
iguales. Un triángulo escaleno es aquel que tiene sus tres lados
desiguales. Ejemplo: Se ingresa un 3, 4 y 5, la computadora muestra:
“Es un triángulo escaleno”.
* */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ladoA;
        int ladoB;
        int ladoC;
        System.out.print("Ingrese lado A: ");
        ladoA = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese lado B: ");
        ladoB = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese lado C: ");
        ladoC = Integer.parseInt(scanner.nextLine());
        boolean esValido = ladoA < (ladoB + ladoC) && ladoB < (ladoA + ladoC) && ladoC < (ladoA + ladoB);
        if (esValido) {
            boolean sonTodosLadosIguales = ladoA == ladoB && ladoB == ladoC;
            boolean hayDosLadosIguales = ladoA == ladoB || ladoA == ladoC || ladoB == ladoC;
            if (sonTodosLadosIguales) {
                System.out.println("Es un triangulo equilatero");
            } else if (hayDosLadosIguales) {
                System.out.println("Es un triangulo isoceles");
            } else {
                System.out.println("Es un triangulo escaleno");
            }
        } else {
            System.out.print("No es un triagulo Valido");
        }

        scanner.close();
    }
}
