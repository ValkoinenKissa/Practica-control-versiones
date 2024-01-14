package geometria;

import java.util.Scanner;

public class Area_rectangulo {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce la base: ");
		double base = entrada.nextDouble();
		System.out.println("Introduce la altura: ");
		double altura = entrada.nextDouble();
		double areaCalculada = calcularArea(base, altura);
		imprimeResult(areaCalculada);
		entrada.close();
	}

	public static double calcularArea(double base, double altura) {
		double resultado = base * altura;
		return resultado;
	}

	public static void imprimeResult(double resultado) {
		System.out.println("El area del rectangulo es: " + resultado);
	}
}
