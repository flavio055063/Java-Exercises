package program;

import java.util.Scanner;

import util.CurrencyConverter;

public class Main {

		public static void main(String args[]) {
			System.out.println("Insira o valor do dólar na moeda atual: ");
			Scanner sc = new Scanner(System.in);
			double dollarValue = sc.nextDouble();
			System.out.println("Insira o valor de dólares a serem comprados: ");
			double dollarToBeBought = sc.nextDouble();
			System.out.printf("Valor a ser pago em reais para"
					+ " comprar U$%.2f: %.2f", 
					dollarToBeBought,
					CurrencyConverter.amountToPayUsd(dollarToBeBought, dollarValue));
		
		}
}
