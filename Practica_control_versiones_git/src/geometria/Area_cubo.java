package geometria;

import java.util.Scanner;

public class Area_cubo {
    // Método estático para calcular el área de un cubo
    public static double calcularArea(double lado) {
        return 6 * Math.pow(lado, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese la longitud del lado del cubo: ");
        double lado = scanner.nextDouble();

        // Llamada al método estático para calcular el área del cubo
        double area = calcularArea(lado);

        System.out.println("Área del cubo: " + area);
    }
}
