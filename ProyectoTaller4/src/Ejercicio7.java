import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        double kW_costo_hora, kW_consumidos_mes, valor_mes, descuento_3edad;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Cual es el costo por kilovatio/hora:");
        kW_costo_hora = tecladoScanner.nextDouble();
        System.out.println("Cual es el número de kilovatios consumidos en el mes:");
        kW_consumidos_mes = tecladoScanner.nextDouble();
        tecladoScanner.close();

        descuento_3edad = 0.1;
        valor_mes = (kW_costo_hora * kW_consumidos_mes);
        descuento_3edad *= valor_mes;
        valor_mes -= descuento_3edad;

        System.out.println("La planilla de luz es :" + valor_mes);
    }
}

/*
 * Saida de resultados
 * Cual es el costo por kilovatio/hora:
 * 0.104
 * Cual es el número de kilovatios consumidos en el mes:
 * 270
 * La planilla de luz es :28.08
 */