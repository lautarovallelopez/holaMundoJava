import java.util.Scanner;
/*
* )Desarrollar un algoritmo que simule una calculadora básica que realice
operaciones de suma, resta, multiplicación y división. Se deben recibir
como entrada dos números reales y un operador, que puede ser '+', '-', '*'
ó '/'. La salida del programa debe ser el resultado de la operación. Ayuda:
Prever que se puede llegar a intentar hacer una división por cero.

* */
public class Ejercicio15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numero1;
        double numero2;
        char operador;
        double resultado = 0;
        System.out.print("Ingrese el primer numero: ");
        numero1 = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese el segundo numero: ");
        numero2 = Double.parseDouble(scanner.nextLine());
        System.out.print("Ingrese operador (+-*/): ");
        operador = scanner.nextLine().charAt(0);
        switch (operador) {
            case '+':
                resultado = numero1 + numero2;
                break;
            case '-':
                resultado = numero1 - numero2;
                break;
            case '*':
                resultado = numero1 * numero2;
                break;
            case '/':
                if (numero2 != 0) {
                    resultado = numero1 / numero2;
                }
                break;
            default:
                break;
        }
        System.out.println("El resultado es: " + resultado);
        scanner.close();
    }
}
