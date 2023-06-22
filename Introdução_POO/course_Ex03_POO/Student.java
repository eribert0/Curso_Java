package entities;

public class Student {
	
	public String name;
	public double trim1;
	public double trim2;
	public double trim3;
	
	public double notaFinalAno() {
		return trim1 + trim2 + trim3;
	}
	
	public double situation() {
		if(notaFinalAno() < 60.00) {
			return 60.00 - notaFinalAno();
		} else {
			return 0.0;
		}
	}
}
	/*
	public String toStringFailed(double pontos) {
		return "FAILED\n"
			+ "MISSING "
			+ pontos
			+ " POINTS";
	}

	public String toStringPass() {
		return "PASS";
	}*/

