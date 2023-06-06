import java.util.Locale;
import java.util.Scanner;

public class exercicio_ifelse {

	public static void main(String[] args) {
		double x, y;
		
		Scanner sc  = new Scanner(System.in);
		sc.useLocale(Locale.US);
		
		System.out.println("digite o valor de x: ");
		x = sc.nextDouble();
		
		System.out.println("digite o valor de y: ");
		y = sc.nextDouble();
		
		if( x == 0.0 && y == 0.0) {
			System.out.println("Origem");
		} else if(x > 0.0 && y > 0.0){
			System.out.println("Q1");
		} else if(x < 0.0 && y > 0.0){
			System.out.println("Q2");
		} else if(x < 0.0 && y < 0.0){
			System.out.println("Q3");
		} else if(x > 0.0 && y < 0.0){
			System.out.println("Q4");
		}
		
		sc.close();
	}

}
