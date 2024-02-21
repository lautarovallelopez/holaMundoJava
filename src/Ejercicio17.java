import java.util.Scanner;
/*
* )Ingresar por teclado 1 número entero y mostrar por pantalla su tabla de
multiplicar entre 1 y 10 (usando la instrucción for).
* */
public class Ejercicio17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());
        for(int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            System.out.println(numero + " * " + i + " = " + resultado);
        }
        scanner.close();
    }
}
