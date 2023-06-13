import java.util.Locale;
import java.util.Scanner;

public class Ex03_for {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			double a = sc.nextDouble(); //peso 2
			double b = sc.nextDouble(); //peso 3
			double c = sc.nextDouble(); //peso 5
			double mediaPond = (a*2+b*3+c*5)/(2+3+5);
			System.out.printf("%.1f\n", mediaPond);
		}
		
		sc.close();
	}
}

