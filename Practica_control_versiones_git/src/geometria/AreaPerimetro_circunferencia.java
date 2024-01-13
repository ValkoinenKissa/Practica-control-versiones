package geometria;
import java.util.Scanner;
public class AreaPerimetro_circunferencia {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Ingrese el radio de la circunferencia: ");
	        double radio = scanner.nextDouble();

	        // Llamadas a los métodos estáticos para calcular área y perímetro
	        double area = calcularArea(radio);
	        double perimetro = calcularPerimetro(radio);

	        System.out.println("Área de la circunferencia: " + area);
	        System.out.println("Perímetro de la circunferencia: " + perimetro);
	        scanner.close();
	  }
	 
   // Método estático para calcular el área de la circunferencia
   public static double calcularArea(double radio) {
       return Math.PI * Math.pow(radio, 2);
   }

   // Método estático para calcular el perímetro de la circunferencia
   public static double calcularPerimetro(double radio) {
       return 2 * Math.PI * radio;
   }
}
