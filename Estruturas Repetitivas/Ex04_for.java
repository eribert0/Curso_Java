import java.util.Scanner;

public class Ex04_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for(int i = 0; i<N; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(b != 0) {
				double div = (double) a/b;
				System.out.printf("%.2f\n", div);
			} else {
				System.out.println("divisao impossivel");
			}
		}
		
		sc.close();
	}
}

