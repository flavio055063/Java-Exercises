package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer number;
	private LocalDate start;
	private Double value;
	private List<Installment> installments = new ArrayList<>();
	
	//constructors
	public Contract() {
	}
	
	public Contract(Integer number, LocalDate start, Double value) {
		this.number = number;
		this.start = start;
		this.value = value;
	}

	//getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public LocalDate getStart() {
		return start;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

	@Override
	public String toString() {
		return "Contract [number=" + number + ", start=" + start + ", value=" + value + ", installments=" + installments
				+ "]";
	}

	public void setStart(LocalDate start) {
		this.start = start;
	}

	public Double getValue() {
		return value;
	}

	public void setValue(Double value) {
		this.value = value;
	}
	
}