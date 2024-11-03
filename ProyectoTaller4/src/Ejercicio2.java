
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Bloque declaración de variables -> Datos entradas y salida
        double gasto_hijo1, gasto_hijo2, gasto_hijo3, total_gastos;
        Scanner tecladoScanner = new Scanner(System.in);

        // Bloque de lectura de datos de entrada
        System.out.println("Ingrese los gastos del Primer hijo:");
        gasto_hijo1 = tecladoScanner.nextDouble();
        System.out.println("Ingrese los gastos del Segundo hijo:");
        gasto_hijo2 = tecladoScanner.nextDouble();
        System.out.println("Ingrese los gastos del Tercer hijo:");
        gasto_hijo3 = tecladoScanner.nextDouble();
        tecladoScanner.close(); // ? -> cerramos el escaneo del teclado

        // Bloque de procesamiento de datos de entrada
        total_gastos = gasto_hijo1 + gasto_hijo2 + gasto_hijo3;

        // Bloque de salida de Resultados
        System.out.println("El total de gastos de los tres hijos es de:\n" + total_gastos);
    }
}

/*
 * Salida de resultados
 * Ingrese los gastos del Primer hijo:
 * 30
 * Ingrese los gastos del Segundo hijo:
 * 60
 * Ingrese los gastos del Tercer hijo:
 * 90
 * El total de gastos de los tres hijos es de:
 * 180.0
 */
