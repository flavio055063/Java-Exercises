package entities;

public class Account {
	private int id;
	private String name;
	private double balance;
	
	public Account(int id, String name, double inicialDeposit) {
		this.id = id;
		this.name = name;
		this.deposit(inicialDeposit);
	}
	public Account(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	
	public void withdraw(double withdraw) {
		if(withdraw < 0.01) {
			System.out.println("Value to withdraw must be equal or greater than $0.01\n");
			return;
		}
		if((withdraw+5)>this.balance) {
			System.out.println("Insufficient funds\n");
			return;
		}
		this.balance -= withdraw;
		System.out.printf("Withdraw done. Your balance is $%.2f", this.balance);
		return;
	}
	
	public void deposit(double deposit) {
		if(deposit < 0.01) {
			System.out.println("Value to deposit must be equal or greater than $0.01\n");
			return;
		}
		this.balance += deposit;
		System.out.printf("Deposit done. Your balance is $%.2f\n", this.balance);
		return;
	}
	
	public String toString() {
		return("Account number: " + this.id + "\nName: " + this.name + "\nBalance: $" + this.balance);
	}
	
	
}
