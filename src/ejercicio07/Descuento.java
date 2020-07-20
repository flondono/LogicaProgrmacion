package ejercicio07;

import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de escritorios: ");
        int numEscritorios = entrada.nextInt();

        //Procedimiento para calcular Descuento
        double valorTotal = calcularDescuento(numEscritorios);
        System.out.println("El valor a pagar es: $ " + valorTotal);
    }

    private static double calcularDescuento(int escritorio) {

        double valorDescuento = 0;
        final double VALORUNIDAD = 650000;

        if (escritorio < 5) {
            valorDescuento = (VALORUNIDAD * escritorio) * 0.9;
            return valorDescuento;
        } else if (escritorio >= 5 && escritorio < 10) {
            valorDescuento = (VALORUNIDAD * escritorio) * 0.8;
            return valorDescuento;
        } else {
            valorDescuento = (VALORUNIDAD * escritorio) * 0.6;
            return valorDescuento;
        }

    }
}