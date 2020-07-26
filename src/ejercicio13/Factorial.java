package ejercicio13;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //Pido dato de entrada
        System.out.print("Ingrese número: ");
        int num = sc.nextInt();

        // mostramos resultado
        System.out.printf("El facotial de %d es %.0f\n", num , factorial(num));
    }

    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }

}
