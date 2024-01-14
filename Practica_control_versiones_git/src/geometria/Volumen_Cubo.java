package geometria;

import java.util.Scanner;

public class Volumen_Cubo {

    public static double calcularVolumen(double lado) {
        return Math.pow(lado, 3);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el lado del cubo: ");

        double lado = scanner.nextDouble();

        scanner.close();

        double volumen = calcularVolumen(lado);

        System.out.println("El volumen del cubo con lado " + lado + " es: " + volumen);
    }
}