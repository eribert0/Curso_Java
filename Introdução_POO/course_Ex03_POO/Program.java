package application;

import java.util.Locale;
import java.util.Scanner;
import entities.Student;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		student.name = sc.nextLine();
		
		student.trim1 = sc.nextDouble();
		student.trim2 = sc.nextDouble();
		student.trim3 = sc.nextDouble();
		
		System.out.printf("FINAL GRADE = %.2f\n", student.notaFinalAno());
		
		if(student.notaFinalAno() < 60.00) {
			System.out.printf("FAILED\n"
					+ "MISSING %.2f POINTS", student.situation());	
		} else {
			System.out.println("PASS");
		}
	
		
		sc.close();
	}

}
