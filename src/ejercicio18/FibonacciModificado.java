package ejercicio18;

import java.util.Scanner;

public class FibonacciModificado {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuántos términos quiere: ");
        int n = sc.nextInt();

        /*Secuencia
          0, 1, 2, 3, 6, 11, 20, 37
        */
        int a = 0, b = 1, c = 2, d, s = 3;

        System.out.print(a + "\t" + b + "\t" + c + "\t");

        for (int i = 3; i < n; i++) {
            d = a + b + c;
            System.out.print(d + "\t");
            a = b;
            b = c;
            c = d;
            s += c;
        }

        System.out.println("\n" + "La sumatoria es: " + s);
    }
}
