import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Texto\nen\nlineas\nseparadas");
        System.out.println("Esto no se ve\rCarro retornado");
        System.out.println("Borro espacio \ba la izquierda");
        System.out.println("Imprimo la barra invertida: \\");
        System.out.println("Imprimo la comilla simple: '");
        System.out.println("Imprimo la comilla soble: \"");

        System.out.print("Ingrese un valor numerico: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("\nEl numero ingresado por teclado es: " + numero );

        scanner.close();
    }
}