import java.util.Scanner;
/*
* )Codifique un programa en Java que permita el ingreso de un número, y a
partir de ello, mostrar los diez números siguientes al mismo. Resuelva el
ejercicio con las siguientes estructuras iterativas: for, while y do-while.
* */
public class Ejercicio16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        int numeroMinAMostrar;
        int numeroMaxAMostrar;
        System.out.print("Ingrese un numero: ");
        numero = Integer.parseInt(scanner.nextLine());
        numeroMinAMostrar = numero + 1;
        numeroMaxAMostrar = numero + 10;
        for (int i = numeroMinAMostrar; i <= numeroMaxAMostrar; i++) {
            System.out.println(i);
        }
        while(numeroMinAMostrar <= numeroMaxAMostrar) {
            System.out.println(numeroMinAMostrar);
            numeroMinAMostrar++;
        }
        numeroMinAMostrar = numero + 1;
        do {
            System.out.println(numeroMinAMostrar);
            numeroMinAMostrar++;
        } while(numeroMinAMostrar <= numeroMaxAMostrar);
        scanner.close();
    }
}
