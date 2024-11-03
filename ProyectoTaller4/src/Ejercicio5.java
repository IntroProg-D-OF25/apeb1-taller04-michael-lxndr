import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        double costo_cpu, costo_teclado, costo_pantalla, costo_ratón, costo_total;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Introduzca el precio de CPU:");
        costo_cpu = tecladoScanner.nextDouble();
        System.out.println("Introduzca el precio de Teclado:");
        costo_teclado = tecladoScanner.nextDouble();
        System.out.println("Introduzca el precio de la Pantalla:");
        costo_pantalla = tecladoScanner.nextDouble();
        System.out.println("Introduzca el precio del Ratón:");
        costo_ratón = tecladoScanner.nextDouble();
        tecladoScanner.close();

        costo_total = costo_cpu + costo_teclado + costo_pantalla + costo_ratón;

        System.out.println("El costo total de la computadora es de:\n" + costo_total);
    }

}
/*
 * Salida de resultados
 * Introduzca el precio de CPU:
 * 2
 * Introduzca el precio de Teclado:
 * 4
 * Introduzca el precio de la Pantalla:
 * 6
 * Introduzca el precio del Ratón:
 * 8
 * El costo total de la computadora es de:
 * 20.0
 */