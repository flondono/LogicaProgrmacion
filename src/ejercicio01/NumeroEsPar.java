package ejercicio01;

import java.util.Scanner;

public class NumeroEsPar {

    public static void main(String[] args) {
        int numero;

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese un número: ");
        numero = entrada.nextInt();

        if (numero % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número no es par");
        }
    }
}
