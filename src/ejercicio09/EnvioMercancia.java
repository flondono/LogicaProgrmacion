package ejercicio09;

import java.util.Scanner;

public class EnvioMercancia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Peso de la mercancia: ");
        float peso = entrada.nextFloat();

        System.out.print("Valor de la mercancia: ");
        double valorMercancia = entrada.nextDouble();

        System.out.print("Es lunes [S]í [N]o: ");
        String esLunes = entrada.next();

        System.out.print("Tipo de pago [E]fectivo [T]arjeta: ");
        String tipoPago = entrada.next();

        //Realizo calculos
        double tarifa = calcularTarifa(peso);
        double descuento = calcularDescuento(valorMercancia);
        double promocion = calcularPromocion(esLunes, tipoPago, valorMercancia);

        if (promocion > 0) {
            double valorPromocion = tarifa * promocion;
            System.out.println("Tarifa: " + tarifa);
            System.out.println("Descuento: " + valorPromocion);
            System.out.println("Total a pagar: " + (tarifa - valorPromocion));
        } else {
            double valorDescuento = tarifa * descuento;
            System.out.println("Tarifa: " + tarifa);
            System.out.println("Descuento: " + valorDescuento);
            System.out.println("Total a pagar: " + (tarifa - valorDescuento));
        }

        //Muestro resultados


    }

    private static double calcularPromocion(String esLunes, String tipoPago, double mercancia) {
        if (esLunes.equals("S") && tipoPago.equals("T")) {
            return 0.5;
        } else if (tipoPago.equals("E") && mercancia > 1000000) {
            return 0.6;
        } else {
            return 0;
        }
    }

    private static double calcularDescuento(double valorMercancia) {
        if (valorMercancia >= 300000 && valorMercancia <= 600000) {
            return 0.1;
        } else if (valorMercancia > 600000 && valorMercancia <= 1000000) {
            return 0.2;
        } else if (valorMercancia > 1000000) {
            return 0.3;
        }
        return 0;
    }

    private static double calcularTarifa(float peso) {
        int aux = 0;
        if (peso < 100) {
            return 20000;
        } else if (peso >= 100 && peso <= 150) {
            return 25000;
        } else if (peso > 150 && peso <= 200) {
            return 30000;
        } else {
            aux = (int) ((peso - 200) / 10);
            return 35000 + (aux * 2000);
        }
    }
}
