import java.util.Scanner;

public class Usando_Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		String x;
		x = sc.next();
		
		System.out.println("Você digitou a palavra: "+x);
		
		sc.close();
	}

}
