import java.util.Scanner;

public class ex03_while {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = 0, alc = 0, gas = 0, die = 0;
		/*1. Alcool
		 *2. Gasolina
		 *3. Diesel
		 *4. FIM*/
		while(x != 4) {
			/*if(x == 1) {
				alc ++;
			} else if(x == 2) {
				gas++;
			} else if(x == 3) {
				die++;
			}*/
			
			switch(x) {
			case 1:
				alc++;
				break;
			case 2:
				gas++;
				break;
			case 3:
				die++;
				break;
			}
			
			x = sc.nextInt();
		}
		
		System.out.printf("MUITO OBRIGADO\n"
				+ "Alcool: %d\nGasolina: %d\n"
				+ "Diesel: %d\n", alc, gas, die);
		
		sc.close();
	}

}
