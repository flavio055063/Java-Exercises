package program;

import entities.Order;
import entities.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {
		Order order = new Order(1, OrderStatus.PENDING_PAYMENT);
		//ou, para converter String para enum:
		Order order2 = new Order(2, OrderStatus.valueOf("PROCESSING"));
		System.out.println(order);
		System.out.println(order2);
	}

}
