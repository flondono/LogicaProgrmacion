package ejercicio05;

import java.util.Scanner;

public class AnoBiciesto {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.print("Ingrese el año a validar: ");
        int anoBisiesto = Integer.parseInt(entrada.nextLine());
        if ((anoBisiesto % 4 == 0) && ((anoBisiesto % 100 != 0) || (anoBisiesto % 400 == 0))) {
            System.out.println("El año es bisiesto");
        } else {
            System.out.println("El año no es bisiesto");
        }
    }
}
