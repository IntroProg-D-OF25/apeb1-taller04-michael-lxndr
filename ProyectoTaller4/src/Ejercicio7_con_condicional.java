import java.util.Scanner;

public class Ejercicio7_con_condicional {

    public static void main(String[] args) {
        double kW_costo_hora, kW_consumidos_mes, valor_mes, descuento_3edad;
        int edad;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Introduzca su edad:");
        edad = tecladoScanner.nextInt();
        System.out.println("Introduzca el costo por kilovatio/hora:");
        kW_costo_hora = tecladoScanner.nextDouble();
        System.out.println("Introduzca el número de kilovatios consumidos en el mes:");
        kW_consumidos_mes = tecladoScanner.nextDouble();
        tecladoScanner.close();

        valor_mes = (kW_costo_hora * kW_consumidos_mes);
        if (edad >= 60) {
            descuento_3edad = 0.1;
            descuento_3edad *= valor_mes;
            valor_mes -= descuento_3edad;
        }

        System.out.println("La planilla de luz es:\n" + valor_mes);
    }
}

/*
 * Salida de resultados para un usuario estándar
 * Introduzca su edad:
 * 30
 * Introduzca el costo por kilovatio/hora:
 * 0.104
 * Introduzca el número de kilovatios consumidos en el mes:
 * 270
 * La planilla de luz es:
 * 28.08
 */
/*
 * Salida de resultados para un usuario de la tercera edad
 * Introduzca su edad:
 * 60
 * Introduzca el costo por kilovatio/hora:
 * 0.104
 * Introduzca el número de kilovatios consumidos en el mes:
 * 270
 * La planilla de luz es:
 * 25.272
 */