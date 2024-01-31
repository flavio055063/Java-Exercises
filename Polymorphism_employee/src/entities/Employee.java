package entities;

public class Employee {
	private Integer id;
	private String name;
	private Float workedHours, valuePerHour;
	
	public Employee(Integer id, String name, Float workedHours, Float valuePerHour) {
		this.id = id;
		this.name = name;
		this.workedHours = workedHours;
		this.valuePerHour = valuePerHour;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", workedHours=" + workedHours + ", valuePerHour="
				+ valuePerHour + "]";
	}
	
	public Float payment() {
		return this.workedHours*this.valuePerHour;
	}

	//getters e setters
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Float getWorkedHours() {
		return workedHours;
	}

	public void setWorkedHours(Float workedHours) {
		this.workedHours = workedHours;
	}

	public Float getValuePerHour() {
		return valuePerHour;
	}

	public void setValuePerHour(Float valuePerHour) {
		this.valuePerHour = valuePerHour;
	}
}
