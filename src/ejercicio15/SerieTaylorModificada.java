package ejercicio15;

import java.util.Scanner;

public class SerieTaylorModificada {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos términos desea:");
        int n = sc.nextInt();

        System.out.print("Ingrese el valor de X:");
        int x = sc.nextInt();

        // Calculos
        double s = 0, t;
        int sig = 1;
        for (int i = 0; i < n; i++) {
            t = Math.pow(x, i) / factorial(i) * sig;
            s += t;
            sig *= -1;
        }

        //Mostramos resultados
        System.out.printf("f(%d)=%f\n", x, s);
    }

    public static double factorial(int n) {
        double aux = 1;
        for (int i = 2; i <= n; i++) {
            aux *= i;
        }
        return aux;
    }
}
