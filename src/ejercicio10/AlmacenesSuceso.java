package ejercicio10;

import java.util.Scanner;

public class AlmacenesSuceso {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        double vr_v;
        double vr_p;

        System.out.println("*** DATOS DE ENTRADA ***");
        System.out.print("Costo de compra ($)....................................................:");
        double cc = entrada.nextDouble();

        System.out.print("Tipo de producto [P]erecedero, [N]o perecedero.........................:");
        char tp = entrada.next().charAt(0);

        System.out.print("Tipo de conservación [F]rio, [A]mbiente................................:");
        char tc = entrada.next().charAt(0);

        System.out.print("Periodo de conservación (días).........................................:");
        int pc = entrada.nextInt();

        System.out.print("Periodo de almacenamiento (días).......................................:");
        int pa = entrada.nextInt();

        System.out.print("Volumen (litros).......................................................:");
        int vol = entrada.nextInt();

        System.out.print("Medio de almacenamiento [N]evera, [C]ongelador, [E]estanteria, [G]uacal:");
        char ma = entrada.next().charAt(0);

        System.out.println("*** CALCULOS ***");

        int ca = (int) calcularCostoAlmacenaiento(tp, cc, tc, pc, pa, vol);
        float pdp = (float) calcularPorcentajeDepreciacion(pa);
        int ce = (int) calcularCostoExibicion(tp, tc, ma);

        //Valor del producto
        vr_p = (cc + ca + ce) * pdp;

        if (tp == Character.valueOf('P')) { //Predecedero
            vr_v = ((cc + ca + ce) * pdp) * 1.4;
        } else { //No predecedero
            vr_v = ((cc + ca + ce) * pdp) * 1.2;
        }

        System.out.println("Costos de almacenamiento..............................................:" + ca);
        System.out.println("Porcentaja de depreciación............................................:" + pdp);
        System.out.println("Costo de exhibición...................................................:" + (ca * ce));
        System.out.println("Valor producto........................................................:" + (int) (vr_p));
        System.out.println("Valor venta...........................................................:" + (int) (vr_v));
    }

    private static double calcularPorcentajeDepreciacion(int pa) {

        if (pa < 30) {
            return 0.95;
        } else if (pa >= 30) {
            return 0.85;
        }
        return 0;
    }

    private static double calcularCostoExibicion(char tp, char tc, char ma) {

        double ce = 0;
        //Convertir a mayusculas
        tp = Character.toUpperCase(tp);
        tc = Character.toUpperCase(tc);
        ma = Character.toUpperCase(ma);

        switch (tp) {
            case 'P':
                if (tc == Character.valueOf('F') && ma == Character.valueOf('N')) {
                    ce = 2;
                } else if (tc == Character.valueOf('F') && ma == Character.valueOf('C')) {
                    ce = 1;
                }
                break;
            case 'N':
                if (ma == Character.valueOf('E')) {
                    ce = 0.05;
                } else if (ma == Character.valueOf('G')) {
                    ce = 0.07;
                }
                break;
        }
        return ce;
    }

    private static double calcularCostoAlmacenaiento(char tp, double cc, char tc, int pc, int pa, int vol) {

        //Convertir en mayuscula el valor ingresado
        tp = Character.toUpperCase(tp);
        tc = Character.toUpperCase(tc);

        switch (tp) {
            case 'P':
                if (pc < 10 && tc == 'F') {
                    return cc * 0.05;
                } else if (pc >= 10 && tc == 'F') {
                    return cc * 0.1;
                } else if (pa < 20 && tc == Character.valueOf('A')) {
                    return cc * 0.03;
                } else if (pa > 20 && tc == Character.valueOf('A')) {
                    return cc * 0.1;
                } else if (pa == 20 && tc == Character.valueOf('A')) {
                    return cc * 0.05;
                }
                break;
            case 'N':
                if (vol >= 50) {
                    return cc * 0.1;
                } else if (vol < 50) {
                    return cc * 0.2;
                }
                break;
        }
        return cc;
    }
}
