package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {
	//Exercício Banco - POO
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc =  new Scanner(System.in);
		
		Account account;
		
		System.out.println("Account registration");
		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account owner: ");
		sc.nextLine();
		String name = sc.nextLine();
		
		System.out.print("Is there an initial deposit? (y/n) ");
		char aux = sc.next().charAt(0);
		
		if(aux == 'y') {
			System.out.print("Enter initial deposit value: ");
			double depInicial = sc.nextDouble();
			account = new Account(numConta, name, depInicial);
		} else {
			account = new Account(numConta, name);
		}
		
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double valorDep = sc.nextDouble();
		account.deposito(valorDep);
		System.out.println("Updated account data: ");
		System.out.println(account.toString());
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double valorSaque = sc.nextDouble();
		account.saque(valorSaque);
		System.out.println("Updated account value: ");
		System.out.println(account.toString());
		
		sc.close();
	}

}
