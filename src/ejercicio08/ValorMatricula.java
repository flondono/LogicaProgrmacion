package ejercicio08;

import java.util.Scanner;

public class ValorMatricula {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Número de créditos: ");
        int creditos = entrada.nextInt();

        System.out.print("Valor crédito: ");
        double valorCredito = entrada.nextDouble();

        System.out.print("Estrato del estudiante: ");
        short estrato = entrada.nextShort();

        //Calcular valor de la matricula
        double valorMatricula = calcularMatricula(creditos, valorCredito, estrato);

        //Calcular valor del subsidio
        double valorSubsidio = calcularSubsidio(estrato);

        System.out.println("Costo de la matricula: " + valorMatricula);

        System.out.println("Valor del subsidio: " + valorSubsidio);
    }

    private static double calcularSubsidio(short estrato) {
        double subsidio = 0;
        switch (estrato) {
            case 1:
                subsidio = 200000;
                break;
            case 2:
                subsidio = 100000;
                break;
        }
        return subsidio;
    }

    private static double calcularMatricula(int creditos, double valorCredito, short estrato) {
        int aux = 0;
        double valorMatricula = 0;
        if (creditos <= 20) {
            valorMatricula = valorCredito * valorCredito;
        } else if (creditos > 20) {
            aux = creditos - 20;
            valorMatricula = (creditos * valorCredito) + ((valorCredito * 2) * aux);
        }

        //Calcular descuento en base al estrato
        switch (estrato) {
            case 1:
                valorMatricula = valorMatricula * 0.8;
            case 2:
                valorMatricula = valorMatricula * 0.5;
            case 3:
                valorMatricula = valorMatricula * 0.3;
        }
        return valorMatricula;
    }
}
