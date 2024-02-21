/*
* Ingresar por teclado los lados de un triángulo rectángulo (valores enteros)
y calcular el perímetro y su superficie. Para la raíz cuadrada de la
hipotenusa deberá utilizar la clase Math. Ayuda: la superficie es
base*altura/2 y el perímetro del triangulo es base+altura+hipotenusa,
donde hipotenusa = √(𝑏𝑎𝑠𝑒2 + 𝑎𝑙𝑡𝑢𝑟𝑎2)
* */
import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int lado1;
        int lado2;
        double superficie;
        double perimetro;
        double hipotenusa;
        System.out.print("Ingrese lado 1: ");
        lado1 = Integer.parseInt(scanner.nextLine());
        System.out.print("Ingrese lado 2: ");
        lado2 = Integer.parseInt(scanner.nextLine());
        superficie = lado1 * lado2 / (double)2;
        hipotenusa = Math.sqrt(Math.pow(lado1, 2) + Math.pow(lado2, 2));
        perimetro = lado1 + lado2 + hipotenusa;
        System.out.println("La superficie es " + superficie);
        System.out.println("El perimetro es " + perimetro);
        scanner.close();
    }
}
