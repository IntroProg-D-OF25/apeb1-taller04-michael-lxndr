
import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        // Bloque declaración de variables -> Datos entradas y salida
        double base_triangulo, alto_triangulo, area_triangulo;
        Scanner tecladoScanner = new Scanner(System.in); // Para leer valores desde consola

        // Bloque de lectura de datos de entrada
        System.out.println("dame la base del triangulo :");
        base_triangulo = tecladoScanner.nextDouble();
        System.out.println("dame la altura de triangulo :");
        alto_triangulo = tecladoScanner.nextDouble();
        tecladoScanner.close();

        // Bloque de procesamiento de datos de entrada
        area_triangulo = (alto_triangulo * base_triangulo) / 2;

        // Bloque de salida de Resultados
        System.out.println("El area del triangulo es " + area_triangulo);

    }
}

/*
 * Salida de resultados
 * dame la base del triangulo :
 * 3
 * dame la altura de triangulo :
 * 6
 * El area del triangulo es 9.0
 */
