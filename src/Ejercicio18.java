import java.util.Scanner;
/*
* )Ingresar por teclado 1 número entero y
mostrar por pantalla su tabla de multiplicar entre 1 y 10 (usando la
instrucción while).
* */
public class Ejercicio18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());

        int contador = 1;
        while(contador <= 10) {
            int resultado = numero * contador;
            System.out.println(numero + " * " + contador + " = " + resultado);
            contador++;
        }
        scanner.close();
    }
}
