import java.util.Scanner;

public class Ex01_for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x, i=0;
		
		x = sc.nextInt();
		
		for(i=0; i<x;i++) {
			if(i%2!=0) {
				System.out.println("Ímpar! -> numero: "+i);
			}
		}
		
		sc.close();
	}

}
