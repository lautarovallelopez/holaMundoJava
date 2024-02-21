import java.util.Scanner;
/*
* )Crear un programa que muestre en pantalla una escalera inversa de
asteriscos. La cantidad de filas de la escalera se ingresa por teclado.
Utilice la instrucción for.
* */
public class Ejercicio19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int asteriscos;
        System.out.print("Ingrese cantidad de filas: ");
        asteriscos = Integer.parseInt(scanner.nextLine());
        for(int numeroFila = asteriscos; numeroFila >= 1; numeroFila--) {
            for (int numeroColumna = numeroFila; numeroColumna >= 1; numeroColumna--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        scanner.close();
    }
}
