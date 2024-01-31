package program;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Main {
	public static void main(String args[]) {
		ArrayList<Employee> employees = new ArrayList<>();
	
		System.out.println("---- FUNCIONARIOS -----");
		System.out.print("Insira a quantidade de funcionários a serem cadastrados: ");
		
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);;
		int qtd = sc.nextInt();
		
		for(int i=0; i<qtd; i++) {
			employees.add(criaFuncionario(i, sc));
		}
		
		for(int i=0; i<qtd; i++) {
			System.out.println(employees.get(i));
			System.out.println("Payment: $" + employees.get(i).payment());
		}
		sc.close();
	}
	
	public static Employee criaFuncionario(Integer i, Scanner sc) {
		System.out.print("Outsourced (y/n)? ");
		char outsourced = sc.next().charAt(0);
		System.out.print("Employee [" + i + "] - Id: ");
		Integer id = sc.nextInt();
		sc.nextLine(); //consumir quebra de linha
		System.out.print("Employee [" + i + "] - Name: ");
		String name = sc.nextLine();
		System.out.print("Employee [" + i + "] - Worked Hours: ");
		Float workedHours = sc.nextFloat();
		System.out.print("Employee [" + i + "] - Value per Hour ($): ");
		Float valuePerHour = sc.nextFloat();
	
		if(outsourced == 'y') {
			System.out.print("Employee [" + i + "] - Addicional charge ($): ");
			Float additionalCharge = sc.nextFloat();
			return(new OutsourcedEmployee(id, name, workedHours, valuePerHour, additionalCharge));
		}else {
			return(new Employee(id, name, workedHours, valuePerHour));
		}
	}
}
