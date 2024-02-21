import java.util.Scanner;
/*
* Desarrollar un algoritmo que permita ingresar un número N. Acto seguido,
permitir ingresar N números enteros, correspondientes a las notas de un
curso. La computadora muestra el promedio de las notas ingresadas.
Ejemplo: Se ingresa 4, luego 4 7 3 9, la computadora muestra: 5.75.

* */
public class Ejercicio20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadDeNotas;
        System.out.print("Ingrese la cantidad de notas a ingresar: ");
        cantidadDeNotas = Integer.parseInt(scanner.nextLine());
        double notaAcumuladas = 0;
        for (int alumno = 1; alumno <= cantidadDeNotas; alumno++) {
            System.out.print("Ingrese la nota para el alumno " + alumno + ": ");
            notaAcumuladas += Double.parseDouble(scanner.nextLine());
        }
        double promedio = notaAcumuladas / cantidadDeNotas;
        System.out.println("El promedio es: " + promedio);
        scanner.close();
    }
}
