package entities;

public class Account {
	
	private int numConta;
	private String name;
	private double saldoConta;
	
	public Account(int numConta, String name) {
		this.numConta = numConta;
		this.name = name;
		this.saldoConta = 0.0;
	}
	
	public Account(int numConta, String name, double depInicial) {
		this.numConta = numConta;
		this.name = name;
		this.saldoConta = depInicial;
	}
	
	public int getNumConta() {
		return numConta;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double saldoConta) {
		this.saldoConta += saldoConta;
	}
	
	public void saque(double saldoConta) {
		this.saldoConta -= saldoConta + 5.00;
	}
	
	public String toString() {
		return "Account "
			+ numConta
			+ ", Holder: "
			+ name
			+", Balance: $ "
			+ String.format("%.2f", saldoConta);
	}
	
}
