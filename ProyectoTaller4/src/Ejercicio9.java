
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        double base_triangulo, alto_triangulo, area_triangulo, area_cuadrado, area_rectángulo, area_total;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("ingrese la base del triangulo o el lado del cuadrado");
        base_triangulo = tecladoScanner.nextDouble();
        System.out.println("ingrese la atura del triangulo");
        alto_triangulo = tecladoScanner.nextDouble();
        tecladoScanner.close();

        area_cuadrado = base_triangulo * base_triangulo;
        area_triangulo = (base_triangulo * alto_triangulo) / 2;
        area_rectángulo = base_triangulo * alto_triangulo;
        area_total = area_cuadrado + (area_triangulo * 3) + area_rectángulo;

        System.out.println(" el area de la figura es : " + area_total);

    }
}

/*
 * Salida de resultados
 * ingrese la base del triangulo o el lado del cuadrado
 * 2
 * ingrese la atura del triangulo
 * 1
 * el area de la figura es : 9.0
 */