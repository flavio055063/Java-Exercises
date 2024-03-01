package services;

public class PayPal implements OnlinePayment{
	
	public PayPal() {}
	
	public Double paymentFee(Double amount) {
		return amount * 0.02;
	}

	public Double interest(Double amount, Integer months) {
		return amount * 0.01 * months;
	}
}
