
import java.util.Scanner;

public class Ejercicio9 {

    public static void main(String[] args) {
        double base_triangulo, alto_triangulo, area_triangulo, area_cuadrado, area_rectagulo, area_total;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("ingrese la base del triangulo o el lado del cuarado");
        base_triangulo = tecladoScanner.nextDouble();
        System.out.println("ingrese la atura del triangulo");
        alto_triangulo = tecladoScanner.nextDouble();

        area_cuadrado = base_triangulo * base_triangulo;
        area_triangulo = (base_triangulo * alto_triangulo) / 2;
        area_rectagulo = base_triangulo * alto_triangulo;
        area_total = area_cuadrado + (area_triangulo * 3) + area_rectagulo;

        /*         System.out.println("el area del triangulo es de :" + area_triangulo + "y el area del cuadrado es de : " + area_cuadrado);
        System.out.println(" "); */
        System.out.println(" el area de la figura es : " + area_total);

    }
}
