package program;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import entities.Contract;
import services.ContractService;
import services.PayPal;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		boolean validInput = false;
		
		Contract contract = new Contract();
		
		//input of contract number
		System.out.println("Creating contract");
		System.out.print(" - contract number: ");
		while(!validInput) {
			try{
				Integer number = sc.nextInt();
				contract.setNumber(number);
				validInput = true;
				sc.nextLine();
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Please insert valid integer number (without , or .): ");
			}
		}
		
		//input of contract date
		System.out.print(" - contract date: ");
		validInput = false;
		while(!validInput) {
			try{
				LocalDate localDate = LocalDate.parse(sc.nextLine(), formatter);
				contract.setStart(localDate);
				validInput = true;
			}catch(Exception e) {
				System.out.print("Please insert valid date in the format (dd/mm/yyyy): ");
			}
		}
		
		//input of contract value
		System.out.print(" - contract value ($): ");
		validInput = false;
		while(!validInput) {
			try{
				Double value = sc.nextDouble();
				contract.setValue(value);
				validInput = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Please insert valid value in the format (0.00): ");
			}
		}
		
		//input of installment
		System.out.print(" - number of installments: ");
		validInput = false;
		while(!validInput) {
			try{
				Integer months = sc.nextInt();
				ContractService cs = new ContractService(new PayPal());
				cs.processContract(contract, months);
				System.out.println(contract);
				validInput = true;
			}catch(InputMismatchException e) {
				sc.nextLine();
				System.out.print("Please insert valid value in the format (0.00): ");
			}
		}
		sc.close();
	}

}
