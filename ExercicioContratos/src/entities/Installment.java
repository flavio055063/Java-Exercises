package entities;

import java.time.LocalDate;

public class Installment {
	private LocalDate date;
	private Double amount;
	
	//constructor
	public Installment(LocalDate date, Double amount) {
		this.date = date;
		this.amount = amount;
	}
	
	@Override
	public String toString() {
		return "Installment [date=" + date + ", amount=" + amount + "]";
	}

	//getters and setters
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public Double getAmount() {
		return amount;
	}
	public void setAmount(Double amount) {
		this.amount = amount;
	}
}
