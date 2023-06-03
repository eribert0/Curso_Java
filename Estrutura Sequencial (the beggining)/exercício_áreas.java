import java.util.Locale;
import java.util.Scanner;

public class exercício_áreas {

	public static void main(String[] args) {
		double A, B, C;
		double triangulo, circulo, trapezio, quadrado, retangulo, pi = 3.14159;
		
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		Locale.setDefault(Locale.US);
		
		System.out.println("Digite o valor de A: "); 
		A = scan.nextDouble();
		
		System.out.println("Digite o valor de B: "); 
		B = scan.nextDouble();
		
		System.out.println("Digite o valor de C: "); 
		C = scan.nextDouble();
		
		triangulo = (A * C)/2.0;
		circulo = pi * Math.pow(C, 2);
		trapezio = ((A+B)*C)/2;
		quadrado = Math.pow(B, 2);
		retangulo = A * B;
		
		System.out.printf("TRIÂNGULO: %.3f\n", triangulo);
		System.out.printf("CÍRCULO: %.3f\n", circulo);
		System.out.printf("TRAPÉZIO: %.3f\n", trapezio);
		System.out.printf("CÍRCULO: %.3f\n", quadrado);
		System.out.printf("RETÂNGULO: %.3f\n", retangulo);
		
		scan.close();
	}

}
