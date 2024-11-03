
import java.util.Scanner;

public class Ejercicio3 {

    public static void main(String[] args) {
        // Bloque declaración de variables -> Datos entradas y salida
        Double numeroTabla;
        Scanner tecladoScanner = new Scanner(System.in);
        // Bloque de lectura de datos de entrada
        System.out.println("Ingrese la tabla q desea consultar: ");
        numeroTabla = tecladoScanner.nextDouble();
        tecladoScanner.close();

        // Bloque de procesamiento de datos de entrada
        System.out.println(" 1 * " + numeroTabla + " es igual a " + (1 * numeroTabla));
        System.out.println(" 2 * " + numeroTabla + " es igual a " + (2 * numeroTabla));
        System.out.println(" 3 * " + numeroTabla + " es igual a " + (3 * numeroTabla));
        System.out.println(" 4 * " + numeroTabla + " es igual a " + (4 * numeroTabla));
        System.out.println(" 5 * " + numeroTabla + " es igual a " + (5 * numeroTabla));
        System.out.println(" 6 * " + numeroTabla + " es igual a " + (6 * numeroTabla));
        System.out.println(" 7 * " + numeroTabla + " es igual a " + (7 * numeroTabla));
        System.out.println(" 8 * " + numeroTabla + " es igual a " + (8 * numeroTabla));
        System.out.println(" 9 * " + numeroTabla + " es igual a " + (9 * numeroTabla));
        System.out.println("10 * " + numeroTabla + " es igual a " + (10 * numeroTabla));
        System.out.println("11 * " + numeroTabla + " es igual a " + (11 * numeroTabla));
        System.out.println("12 * " + numeroTabla + " es igual a " + (12 * numeroTabla));
        // Bloque de salida de Resultados
    }
}

/*
 * Salida de resultados
 * Ingrese la tabla q desea consultar:
 * 3
 *  1 * 3.0 es igual a 3.0
 *  2 * 3.0 es igual a 6.0
 *  3 * 3.0 es igual a 9.0
 *  4 * 3.0 es igual a 12.0
 *  5 * 3.0 es igual a 15.0
 *  6 * 3.0 es igual a 18.0
 *  7 * 3.0 es igual a 21.0
 *  8 * 3.0 es igual a 24.0
 *  9 * 3.0 es igual a 27.0
 * 10 * 3.0 es igual a 30.0
 * 11 * 3.0 es igual a 33.0
 * 12 * 3.0 es igual a 36.0
 */
