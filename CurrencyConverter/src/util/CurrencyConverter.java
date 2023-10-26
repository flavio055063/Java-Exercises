package util;

public class CurrencyConverter {
	
	public static double IOF = 1.06; //IOF = 6%
	
	public static double amountToPayUsd(double usd, double dollarValue) {
		return (usd*dollarValue*IOF);
	}
}
