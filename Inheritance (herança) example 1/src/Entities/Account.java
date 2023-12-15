package Entities;

public class Account {
	private Integer number;
	private String holder;
	private Double balance = 0.0;

	// constructors
	public Account() {
	}

	@Override
	public String toString() {
		return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + "]";
	}

	public Account(Integer number, String holder, Double balance) {
		this.number = number;
		this.holder = holder;
		this.balance = balance;
	}

	// Withdraw money from this account. Return true if successful
	public boolean withdraw(Double value) {
		if (this.balance > value && value > 0) {
			this.balance -= value;
			return true;
		} else {
			System.out.println("Not enough money on account to do this operation.");
			return false;
		}
	}

	// Deposit money into this account. Return true if successful
	public boolean deposit(Double value) {
		if (value > 0) {
			this.balance += value;
			return true;
		} else {
			System.out.println("Deposit value must be greater than $0.0");
			return false;
		}
	}

	// getters and setters
	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public String getHolder() {
		return holder;
	}

	public void setHolder(String holder) {
		this.holder = holder;
	}
}
