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
			System.out.println("Loan done: $"+ amount + " was deposited in the acc.");
		}else {
			System.out.println("not authorized operation");
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
