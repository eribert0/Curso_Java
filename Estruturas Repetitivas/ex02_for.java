import java.util.Scanner;

public class Ex02_for {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();
		int qtIn = 0, qtOut = 0;
		
		for(int i = 0; i < N; i++ ) {
			int x = sc.nextInt();
			
			if(x >= 10 && x <=20) {
				qtIn++;
			} else {
				qtOut++;
			}	
		}
		
		System.out.println(qtIn + " in");
		System.out.println(qtOut + " out");
		
		sc.close();
	}

}
