package ejercicio16;

import java.util.Scanner;

public class EcuacionCuadratica {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Datos de entrada
        System.out.print("Ingrese valor de a:");
        int a = sc.nextInt();
        System.out.print("Ingrese valor de b:");
        int b = sc.nextInt();
        System.out.print("Ingrese valor de c:");
        int c = sc.nextInt();

        //Proceso
        double raiz = Math.sqrt(b * b - 4 * a * c);
        double x1 = (-b + raiz) / (2 * a);
        double x2 = (-b - raiz) / (2 * a);

        //Mostramos resultados
        System.out.printf("X1: %f\n", x1);
        System.out.printf("X2: %f\n", x2);
    }
}
