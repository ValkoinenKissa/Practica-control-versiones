package geometria;

import java.util.Scanner;

public class Area_cilindro {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introduce el radio del cilindro: ");
        double radio = entrada.nextDouble();
        System.out.println("Introduce la altura del cilindro: ");
        double altura = entrada.nextDouble();

        double resultBase = calcularAreaBase(radio);
        double areaLateral = calcularAreaLateral(radio, altura);
        double areaTotal = areaLateral + (2 * resultBase);

        imprimeResult(areaLateral, areaTotal);

        entrada.close();
    }

    public static double calcularAreaBase(double radio) {
        double resultadoAreaBase = Math.PI * Math.pow(radio, 2);
        return resultadoAreaBase;
    }

    public static double calcularAreaLateral(double radio, double altura) {
        double areaLateralSupercifie = 2 * Math.PI * radio * altura;
        return areaLateralSupercifie;
    }

    public static void imprimeResult(double areaLateral, double areaTotal) {
        System.out.println("El area lateral de la superficie es: " + areaLateral);
        System.out.println("El area total de la superficie: " + areaTotal);
    }
}