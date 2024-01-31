package Program;

import entities.Account;
import entities.BusinessAccount;

public class Main {
	public static void main(String args[]) {
		//polimorfismo é quando duas classes que são mesmo tipo (porém uma específica e outra genérica)
		//agem de maneira diferente como mostrado abaixo:
		Account regularAcc = new Account(1000, "Normal account", 100.0);
		Account businessAcc = new BusinessAccount(1001, "Business Acc", 100.0, 20.0);
		
		regularAcc.withdraw(10.0);
		businessAcc.withdraw(10.0);
	}
}
