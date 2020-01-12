package ejercicio06;

import java.util.Scanner;

public class NominaSencilla {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Ingrese nombre: ");
        String nombre = entrada.nextLine();

        System.out.print("Ingrese número de horas trabajadas: ");
        int horasTrabajadas = entrada.nextInt();

        System.out.print("Ingrese valor hora: ");
        double valorHora = entrada.nextDouble();

        System.out.print("Ingrese valor salario mínimo mensual: ");
        double salarioMinimo = entrada.nextDouble();

        if (horasTrabajadas * valorHora > salarioMinimo) {
            //System.out.println("Nombre: " + nombre);
            double salario = horasTrabajadas * valorHora;
            String aux = String.format("Nombre: %s\nSalario: $%,.2f", nombre, salario);
            System.out.println(aux);
        } else {
            System.out.println("Nombre: " + nombre);
        }
    }
}
