package ejercicio03;

import java.util.Scanner;

public class OrdenarNumeros {
    public static void main(String[] args) {

        //Creación objeto Scanner para leer datos del cliente
        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int a = entrada.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int b = entrada.nextInt();

        System.out.print("Ingrese el tercer número: ");
        int c = entrada.nextInt();

        if (a > b && a > c) {
            System.out.println("El mayor es: " + a);
            if (b > c) {
                System.out.println("El número del medio es:" + b);
                System.out.println("El número menor es: " + c);
            } else {
                System.out.println("El número del medio es:" + b);
                System.out.println("El número menor es: " + c);
            }
        } else if (b > a && b > c) {
            System.out.println("El mayor es: " + b);
            if (a > c) {
                System.out.println("El número del medio es:" + a);
                System.out.println("El número menor es: " + c);
            } else {
                System.out.println("El número del medio es:" + c);
                System.out.println("El número menor es: " + a);
            }
        } else {
            System.out.println("El mayor es: " + c);
            if (a > b) {
                System.out.println("El número del medio es:" + a);
                System.out.println("El número menor es: " + b);
            } else {
                System.out.println("El número del medio es:" + b);
                System.out.println("El número menor es: " + c);
            }
        }
    }
}
