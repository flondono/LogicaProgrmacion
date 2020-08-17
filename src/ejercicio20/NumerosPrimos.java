package ejercicio20;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos números desea: ");
        int n = sc.nextInt();

        //Proceso
        int conPrimo = 0, i = 1, s = 0;

        while (conPrimo < n) {
            if (esPrimo(i)) {
                System.out.print(i + "\t");
                conPrimo++;
                s += i;
            }
            i++;
        }

        System.out.println("\nLa suma es: " + s);
        System.out.println("El promedio es: " + (s / n));
    }

    public static boolean esPrimo(int n) {
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
