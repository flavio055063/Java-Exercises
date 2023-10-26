package Program;

import java.util.Scanner;

import util.Calculator;

public class Main {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor do raio da esfera: ");
		double radius = sc.nextDouble();
		System.out.println("A circunferência é: " + Calculator.circunference(radius));
		System.out.println("O volume da esfera é: " + Calculator.esphereVolume(radius));
		sc.close();
	}
	
}
