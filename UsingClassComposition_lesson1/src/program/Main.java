package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.HourContract;
import entities.enums.WorkerLevel;

public class Main {

	public static void main(String[] args) {
		
		//creating employee object list
		List<Employee> employeeList = new ArrayList<>();
		WorkerLevel workerLevel = null;
		
		//user inserts name value
		Scanner sc = new Scanner(System.in);
		System.out.println("---- REGISTER EMPLOYEE ----");
		System.out.println("Name: ");
		String name = sc.next();
		
		//user inserts enum value of worker level
		System.out.println("Woker level [JUNIOR, MID_LEVEL or SENIOR]: ");
		boolean ValidValue = false;
		while(ValidValue == false) {
			try {
				workerLevel = WorkerLevel.valueOf(sc.next());
				ValidValue = true;
			}catch(IllegalArgumentException e){
				System.out.println("Insert a valid value: [JUNIOR, MID_LEVEL or SENIOR]");
			}
		}
		
		//user inserts salary
		System.out.println("Base salary (U$): ");
		Double baseSalary = sc.nextDouble();
		
		//appending the employee in the employee list
		employeeList.add(new Employee(name, workerLevel, baseSalary));
		System.out.println(employeeList);
		
		System.out.println("How many contracts this worker will have?");
		
		//date string to date formatter
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		
		int contractQuantity = sc.nextInt();
		for(int i=0; i<contractQuantity; i++) {
			System.out.printf("---- Employee contract #%d ----\n", i+1);
			System.out.println("Contract date (dd/mm/yyyy): ");
			Date parsedDate = null;
			try {
				parsedDate = format.parse(sc.next());
			}catch (ParseException e) {
				System.out.println("Invalid date string");
			}
			System.out.println("Value per hour (U$): ");
			Double valuePerHour = sc.nextDouble();
			System.out.println("Hours: ");
			Integer hours = sc.nextInt();
			employeeList.get(0).addContract(new HourContract(parsedDate, valuePerHour, hours));
		}
		System.out.println(employeeList);
		sc.close();
	}

}
