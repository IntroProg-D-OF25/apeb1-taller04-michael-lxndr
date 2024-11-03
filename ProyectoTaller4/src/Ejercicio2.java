
import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        // Bloque declaración de variables -> Datos entradas y salida
        double gasto_hijo1, gasto_hijo2, gasto_hijo3, total_gastos;
        Scanner tecladoScanner = new Scanner(System.in);

        // Bloque de lectura de datos de entrada
        System.out.println("dame los gastos del Primer Hijo :");
        gasto_hijo1 = tecladoScanner.nextDouble();
        System.out.println("dame los gastos del Segundo hijo:");
        gasto_hijo2 = tecladoScanner.nextDouble();
        System.out.println("dame los gastos del  Tercer hijo:");
        gasto_hijo3 = tecladoScanner.nextDouble();
        tecladoScanner.close();

        // Bloque de procesamiento de datos de entrada
        total_gastos = gasto_hijo1 + gasto_hijo2 + gasto_hijo3;

        // Bloque de salida de Resultados
        System.out.println("El total de gastos de los tres hijos es de : " + total_gastos);
    }
}

/*
 * Salida de resultados
 * dame los gastos del Primer Hijo :
 * 3
 * dame los gastos del Segundo hijo:
 * 6
 * dame los gastos del Tercer hijo:
 * 9
 * El total de gastos de los tres hijos es de : 18.0
 */
