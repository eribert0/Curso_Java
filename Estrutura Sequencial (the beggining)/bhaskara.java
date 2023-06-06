import java.util.Scanner;

public class bhaskara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a, b, c, delta, x1, x2;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("valor de a: ");
		a = scan.nextDouble();
		
		System.out.println("valor de b: ");
		b = scan.nextDouble();
		
		System.out.println("valor de c: ");
		c = scan.nextDouble();

		delta  = (Math.pow(b, 2) - (4.0 * a * c));
		
		x1 = (- b + Math.sqrt(delta))/(2.0*a);
		x2 = (- b - Math.sqrt(delta))/(2.0*a);
		
		System.out.println("x1: "+x1);
		System.out.println("x2: "+x2);
		
		scan.close();
	}

}
