package ejercicio02;

import java.util.Scanner;

public class NumeroMayor {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //Pido datos de entrada
        System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = entrada.nextInt();

        //Realizamos la comparaciones
        if (a > b && a > c) {
            System.out.println("El número mayor es: " + a);
        } else if (b > a && b > c) {
            System.out.println("El número mayor es: " + b);
        } else {
            System.out.println("El número mayor es: " + c);
        }

    }
}
