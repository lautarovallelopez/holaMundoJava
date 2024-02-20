import java.util.Scanner;

/*
Desarrollar un algoritmo que, dada la edad de una persona (entre 1 y 120
años) y su género ('F' para mujeres, 'M' para hombres), la computadora
indique si está en edad de jubilarse. Ayuda: Las mujeres se jubilan con 60
años o más. Los hombres se jubilan con 65 años o más. Ejemplo:
Ingresa 62 y 'M', debe devolver “No se jubila”.
* */
public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int edad;
        char genero;
        boolean seJubila;
        do {
            System.out.print("Ingrese edad: ");
            edad = Integer.parseInt(scanner.nextLine());
        } while(edad <= 0 || edad > 120);

        do {
            System.out.print("Ingrese genero (F | M): ");
            genero = scanner.nextLine().toUpperCase().charAt(0);
        } while(genero != 'F' && genero != 'M');
        if (genero == 'M') {
            seJubila = edad >= 65;
        } else {
            seJubila = edad >= 60;
        }

        if (seJubila) {
            System.out.print("Se jubila");
        } else {
            System.out.print("No se jubila");
        }

        scanner.close();
    }
}
