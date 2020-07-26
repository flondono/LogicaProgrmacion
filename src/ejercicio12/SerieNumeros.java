package ejercicio12;

import java.util.Scanner;

public class SerieNumeros {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Cuantos números desea:");
        int numero = sc.nextInt();

        imprimir(numero);
        System.out.println();
        sumar(numero);
        System.out.println();

    }

    private static void sumar(int numero) {
        int suma = 0;
        float promedio;
        for (int i = 1; i <= numero; i++) {
            suma += i;
        }
        System.out.println("La suma es: " + suma);
        promedio = suma / numero;
        System.out.println("El promeddio es: " + promedio);
    }

    private static void imprimir(int numero) {
        for (int i = 1; i <= numero; i++) {
            System.out.print(i + "\t");
            if (i % 15 == 0) {
                System.out.println();
            }
        }
    }
}
