package program;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Main {

	public static void main(String[] args) {
		//UPCASTING = casting da subclasse para a superclasse (usado no polimorfimso)
		
		//DOWNCASTING = casting da superclasse para a subclasse. Uso de insanceof (usado em métodos que recebem instâncias genéricas)
		
		//criando uma classe do tipo Account:
		Account acc1 = new Account();
		Account acc2 = new Account(1, "Flavio", 0.0);
		Account acc3 = new Account(2, "Luan", 0.0);
		

		//criando uma classe herdeira do tipo BusinessAccount (herda a Account)
		BusinessAccount bacc = new BusinessAccount(3, "Maria", 0.0, 100.0);
		
		//--------- UPCASTING ----------//
		Account castedAcc1 = bacc;
		Account castedAcc2 = new BusinessAccount(4, "Joana", 0.2, 500.0);
		Account castedAcc3 = new SavingsAccount(5, "joao", 0.0, 600.0);
		
		//--------- DOWNCASTING ----------//
		//apenas classes que já foram algum momento a subclasse podem ser convertidas novamente para a subclasse.
		if (castedAcc1 instanceof BusinessAccount) {
		    BusinessAccount castedBacc1 = (BusinessAccount) castedAcc1;
		    castedBacc1.loan(80.0);
		    System.out.println(castedBacc1.getLoanLimit());
		} else {
		    // Trate o caso em que o downcasting não é possível
		    System.out.println("O objeto não é uma instância de BusinessAccount.");
		}
		System.out.println("FIM");
	}

}
