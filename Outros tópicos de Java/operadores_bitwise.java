import java.util.Scanner;

public class operadores_bitwise {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int mask = 0b00100000;
		int n = sc.nextInt();
		
		if((n & mask) != 0) {
			System.out.println("Sexto bit é true");
		} else {
			System.out.println("Sexto bit é false");
		}
		
		sc.close();
	}

}
