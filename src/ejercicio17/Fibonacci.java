package ejercicio17;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos términos quiere:");
        int n = sc.nextInt();

        int a = 0, b = 1, c, s = 1;
        System.out.print(a + "\t" + b + "\t");

        // 0 1 1 2 3 5 8 13
        for (int i = 2; i <= n; i++) {
            c = a + b;
            System.out.print(c + "\t");
            s += c;
            a = b;
            b = c;
        }
        System.out.println("\nLa sumatoria es: " + s);
    }
}
