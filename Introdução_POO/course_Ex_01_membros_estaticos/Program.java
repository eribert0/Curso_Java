package application;

import java.util.Locale;
import java.util.Scanner;

import util.CurrencyConverter;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What's the dollar price? ");
		double quotation = sc.nextDouble();
		
		System.out.print("How many dollars will be bought? ");
		double dollar = sc.nextDouble();
		
		System.out.printf("Amount to be paid in reais = %.2f\n", 
				+ CurrencyConverter.finalPrice(quotation, dollar));
		
		sc.close();
	}
}
