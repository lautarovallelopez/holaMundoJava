/*
* Ingresar por teclado el radio (tipo de dato entero) de un círculo y calcular
su perímetro y superficie (definidos como double). Utilice la Clase Math
para obtener el valor de PI. Ejemplo: Ingresa 5, debe devolver
perímetro = 31,41592654 y superficie = 78,53981634.
*/
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int radio;
        double perimetro;
        double superficie;
        System.out.print("Ingrese el valor del radio: ");
        radio = Integer.parseInt(scanner.nextLine());
        perimetro = 2 * Math.PI * radio;
        superficie = Math.PI * radio * radio;
        System.out.println("El perimetro es " + String.format("%.8f", perimetro) + " y la superficie es " + String.format("%.8f", superficie));
        scanner.close();
    }
}
