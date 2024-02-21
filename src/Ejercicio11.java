import java.util.Scanner;

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
