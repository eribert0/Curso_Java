package util;

public class CurrencyConverter {
	
	public static final double IOF = 0.06;
	
	public static double finalPrice(double quotation, double dollar) {
		double totalPrice = quotation * dollar;
		return totalPrice += totalPrice * IOF;
	}
}
