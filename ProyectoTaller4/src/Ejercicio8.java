import java.util.Scanner;

public class Ejercicio8 {
    // ! En este ejercicio se plantea que el usuario es menor de 30 años.
    public static void main(String[] args) {
        double netflix, yt_premium, dropbox, spotify, total, descuento_menor30;
        Scanner tecladoScanner = new Scanner(System.in);

        System.out.println("Cual es el costo de Netflix:");
        netflix = tecladoScanner.nextInt();
        System.out.println("Cual es el costo de YouTube Premium:");
        yt_premium = tecladoScanner.nextInt();
        System.out.println("Cual es el costo de Dropbox:");
        dropbox = tecladoScanner.nextInt();
        System.out.println("Cual es el costo de Spotify:");
        spotify = tecladoScanner.nextInt();
        tecladoScanner.close();

        total = netflix + yt_premium + dropbox + spotify;
        descuento_menor30 = 0.2;
        descuento_menor30 *= total;
        total -= descuento_menor30;

        System.out.println("El pago mensual de todos los servicios es de:\n" + total);
    }
}

/*
 * Salida de resultados
 * Cual es el costo de Netflix:
 * 1
 * Cual es el costo de YouTube Premium:
 * 1
 * Cual es el costo de Dropbox:
 * 1
 * Cual es el costo de Spotify:
 * 1
 * El pago mensual de todos los servicios es de:
 * 3.2
 */
