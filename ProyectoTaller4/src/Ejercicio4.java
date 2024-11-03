
import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        double costo_min, min_consumidos_mes, valor_mes;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Ingrese el costo por minutos de la planilla de teléfono:");
        costo_min = tecladoScanner.nextDouble();
        System.out.println("Ingrese el numero de minutos consumidos a mes:");
        min_consumidos_mes = tecladoScanner.nextDouble();
        tecladoScanner.close();

        valor_mes = costo_min * min_consumidos_mes;

        System.out.println("La planilla de teléfono es:\n" + valor_mes);
    }
}

/*
 * Salida de resultados
 * Ingrese el costo por minutos de la planilla de teléfono:
 * 1.23
 * Ingrese el numero de minutos consumidos a mes:
 * 369
 * La planilla de teléfono es:
 * 453.87
 */
