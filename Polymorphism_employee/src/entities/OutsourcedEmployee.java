package entities;

public class OutsourcedEmployee extends Employee{
	private Float additionalCharge;
	public OutsourcedEmployee(Integer id, String name, Float workedHours, Float valuePerHour, Float additionalCharge) {
		super(id, name, workedHours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public Float payment() {
		return (super.payment() + this.additionalCharge * (float)1.1);
	}
	
	@Override
	public String toString() {
		return super.toString() + "-> [additionalCharge=" + additionalCharge + "]";
	}
	
}
