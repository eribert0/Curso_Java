import java.util.Scanner;

public class Main
{
	public static void main(String[] args) {
		
		int a, b, soma;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("digite o primeiro numero: ");
		a = sc.nextInt();
		System.out.println("digite o primeiro numero: ");
		b = sc.nextInt();
		soma = a+b;
		
		System.out.println("SOMA = "+soma);
	}
}
