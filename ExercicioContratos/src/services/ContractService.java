package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	
	private OnlinePayment onlinePaymentMethod;
	
	public ContractService(OnlinePayment onlinePaymentMethod) {
		this.onlinePaymentMethod = onlinePaymentMethod;
	}

	public void processContract(Contract c, Integer months) {
		//see the basic value of an installment
		Double basicQuota = c.getValue() / months;
		
		for(int i=1; i<=months; i++) {
			//add a month to the due date
			LocalDate dueDate = c.getStart().plusMonths(i);
			//calculates the interest of that month
			Double interest = onlinePaymentMethod.interest(basicQuota, i);
			//after the interest is calculated, calculates the fee amount of this month installment
			Double fee = onlinePaymentMethod.paymentFee(basicQuota+interest);
			//calculate the total value of this installment
			Double quota = basicQuota + fee + interest;
			//adding the new Installment to the list of installments
			c.getInstallments().add(new Installment(dueDate, quota));
		}
	}
}
