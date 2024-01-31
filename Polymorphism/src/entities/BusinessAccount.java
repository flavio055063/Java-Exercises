package entities;

public class BusinessAccount extends Account {
	private Double loanLimit = 0.0;

	// constructors
	public BusinessAccount(Double loanLimit) {
		super();
		this.loanLimit = loanLimit;
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	@Override
	public String toString() {
		return "BusinessAccount [loanLimit=" + loanLimit + ", " + super.toString() + "]";
	}

	//loan a amount of money
	public void loan(Double amount) {
		if (amount <= this.loanLimit) {
			//would need to change private do protected in Account.java
			//to change the value of balance directly here
			this.deposit(amount);
		}
	}
	
	// Withdraw money from this account. Tax of this operation in business acc is 5. Return true if successful
	@Override
	public boolean withdraw(Double value) {
		if (this.balance > (value + 5) && value > 0) {
			this.balance -= value + 5;
			System.out.println("Balance: " + balance);
			return true;
		} else {
			System.out.println("Not enough money on account to do this operation.");
			return false;
		}
	}

	// getters and setters
	public double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(double loanLimit) {
		this.loanLimit = loanLimit;
	}
}
