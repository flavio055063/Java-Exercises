package Entities;

public class BusinessAccount extends Account {
	private Double loanLimit = 0.0;

	// constructors
	public BusinessAccount() {
		super();
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public void loan(Double amount) {
		if (amount <= this.loanLimit) {
			this.deposit(amount);
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
