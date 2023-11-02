package entities;

import java.util.ArrayList;
import java.util.List;

import entities.enums.WorkerLevel;

public class Employee {

	String name;
	WorkerLevel workerLevel;
	Double baseSalary;
	List<HourContract> list = new ArrayList<>();
	
	//construtor da entidade funcionário
	public Employee(String name, WorkerLevel wokerLevel, Double baseSalary) {
		this.name = name;
		this.workerLevel = wokerLevel;
		this.baseSalary = baseSalary;
	}
	public void addContract(HourContract newContract) {
		list.add(newContract);
	}
	
	@Override
	public String toString() {
		return "Employee [name=" + name + ", workerLevel=" + workerLevel + ", baseSalary=" + baseSalary + ", list=" + list
				+ "]";
	}

}
