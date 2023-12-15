package Program;

import Entities.BusinessAccount;

public class Main {

	public static void main(String[] args) {
		BusinessAccount acc = new BusinessAccount(10, "Flavio Torres", 0.0, 5000.0);
		System.out.println(acc);
	}

}
