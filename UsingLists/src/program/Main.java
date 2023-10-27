package program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String name;
		Double salary = 0.0;
		
		System.out.println("How many eployees will be hired?");
		int quantity = sc.nextInt();
		
		List<Employee> list = new ArrayList<>();
		
		for(int i=0; i<quantity; i++) {
			System.out.printf("### EMPLOYEE %d ###\n", i+1);
			System.out.printf("%d - Id: ", i+1);
			final Integer id = sc.nextInt();
			if(list.stream().anyMatch(p -> p.getId().equals(id))) {
				System.out.println("There is already a person with this id");
				i--;
			}else {
				System.out.printf("%d - Name: ", i+1);
				name = sc.next();
				System.out.printf("%d - Salary: ", i+1);
				salary = sc.nextDouble();
				list.add(new Employee(id, name, salary));
			}
		}
		
		for(Employee employee: list) {
			System.out.println(employee);
		}
		
		System.out.println("Please select: \n  1 - Increase salary");
		
		if(sc.nextInt() == 1) {
			System.out.println("Please select: \n  1 - Search by id\n  2 - Search by name");
			if(sc.nextInt() == 1) {
				System.out.println("Employee id: ");
				Integer id = sc.nextInt();
				boolean found = false;
				for (Employee employee : list) {
			        if (employee.getId() == id) {
			            System.out.println(employee);
			            System.out.println("Write the raise percentage (0,0 -- 1,0):");
			            employee.giveRaise(sc.nextDouble());
			            System.out.println(employee);
			            found = true;
			        }
			    }
				if(found == false) {
					System.out.println("Id not found in database.");
				}
			}else{
				System.out.println("Functionality not operating. ");
			}
		}
		sc.close();
		System.out.println(" -----  FIM  -----  ");

	}

}
