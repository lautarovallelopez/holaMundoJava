import java.util.Scanner;
/*
* Desarrollar un algoritmo que, dada la
cantidad de alumnos de un curso y la cantidad de sillas disponibles, la
computadora indique si alcanzan las sillas, en caso contrario, indique
cuántas faltan para que todo el alumnado tenga asiento.

* */
public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int cantidadAlumnos;
        int cantidadSillas;
        boolean alcanzanLasSillas;
        int sillasFaltantes;
        System.out.print("Ingrese la cantidad de alumnos: ");
        cantidadAlumnos = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese la cantidad de sillas: ");
        cantidadSillas = Integer.parseInt(scanner.nextLine());
        sillasFaltantes =  cantidadAlumnos - cantidadSillas;
        alcanzanLasSillas = sillasFaltantes <= 0;
        if (alcanzanLasSillas) {
            System.out.println("alcanzan");
        } else {
            System.out.println("Faltan " + sillasFaltantes + " silla/s.");
        }
        scanner.close();
    }
}
