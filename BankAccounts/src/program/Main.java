package program;

import java.util.Scanner;

import entities.Account;

public class Main {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("--- SISTEMA BANCÁRIO ---\n" + "Nome: ");
		String name = sc.next();
		System.out.printf("Número da conta: ");
		int accountNumber = sc.nextInt();
		System.out.printf("Gostaria de fazer um depósito inicial? (y/n):");
		char yn = sc.next().charAt(0);
		
		Account user1;
		
		if(yn == 'y') {
			System.out.printf("Digite o valor a ser depositado: ");
			double initialDeposit = sc.nextDouble();
			System.out.printf("Criando conta...\n");
			user1 = new Account(accountNumber, name, initialDeposit);
		}else {
			System.out.printf("Criando conta...\n");
			user1 = new Account(accountNumber, name);
		}
		System.out.printf("Conta criada! Info:\n");
		System.out.println(user1);
	
		sc.close();
	}
}
