package ejercicio04;

import java.util.Scanner;

public class NumeroMultiploOtro {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        if (a % b == 0) {
            System.out.println("El número: " + a + ", es multiplo de: " + b);
        } else {
            System.out.println("El número: " + a + ", no es multiplo de: " + b);
        }
    }
}
