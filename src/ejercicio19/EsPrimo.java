package ejercicio19;

import java.util.Scanner;

public class EsPrimo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese número: ");
        int n = sc.nextInt();

        String aux = " es primo";

        for (int i = 2; i < n; i++) {
            if ((n % i) == 0) {
                aux = " no es primo";
                break;
            }
        }

        System.out.println("El número: " + n + aux);
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
