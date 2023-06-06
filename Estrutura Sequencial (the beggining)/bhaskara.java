import java.util.Scanner;
import java.util.Locale;

public class bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double a, b, c, delta, x1, x2;
		
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();

		delta  = Math.pow(b, 2) - 4 * a * c;
		
		x1 = (- b + Math.sqrt(delta))/(2*a);
		x2 = (- b - Math.sqrt(delta))/(2*a);
		
		System.out.println("x1: "+x1);
		System.out.println("x1: "+x2);
	}

}
