import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        double interés_m, monto_total, pago_mensual, r;
        int m;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Introduzca el monto total del préstamo:");
        monto_total = tecladoScanner.nextDouble();
        System.out.println("Introduzca el porcentaje de interés mensual:");
        interés_m = tecladoScanner.nextDouble();
        tecladoScanner.close();

        m = 12;
        r = interés_m / 100;
        pago_mensual = (monto_total * (r * (Math.pow(1 + r, m))) / ((Math.pow((1 + r), m)) - 1));

        System.out.println("El pago mensual es de:\n" + pago_mensual);
    }
}

/*
 * Salida de resultados
 * Introduzca el monto total del préstamo:
 * 900
 * Introduzca el porcentaje de interés mensual:
 * 3
 * El pago mensual es de:
 * 90.41587692566668
 */