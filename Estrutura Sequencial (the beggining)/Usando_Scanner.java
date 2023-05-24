import java.util.Scanner;

public class Usando_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		//String x;
		int x;
		x = sc.nextInt();
		
		System.out.println("Você digitou: "+x);
		
		sc.close();
	}

}
