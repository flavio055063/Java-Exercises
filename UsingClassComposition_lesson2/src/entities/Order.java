package entities;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import entities.enums.OrderStatus;

public class Order {
	private Client client;
	private LocalDateTime currentDateTime;
	private OrderStatus status;
	private List<OrderItem> itens = new ArrayList<>();
	
	//constructor
	public Order(Client client, List<OrderItem> itens) {
		this.client = client;
		this.currentDateTime = LocalDateTime.now();;
		this.status = OrderStatus.PROCESSING;
		this.itens = itens;
	}
	public Order(Client client, OrderItem item) {
		this.client = client;
		this.currentDateTime = LocalDateTime.now();;
		this.status = OrderStatus.PROCESSING;
		this.itens.add(item);
	}
	public Order() {
	}

	@Override
	public String toString() {
		return "\n Order \n	[client=" + client + ", currentDateTime=" + currentDateTime + ", status=" + status + ", itens="
				+ itens + "]";
	}
	
	//add a item to the list of products in this order
	public void addOrderItem(OrderItem item) {
		this.itens.add(item);
	}
	
	//removing a item from the list of this order.
	public void removeOrderItem(OrderItem item) {
		this.itens.remove(item);
	}
	
	//calculate total cost from this order
	public float orderCost(){
		float total = 0;
		for(int i=0; i<itens.size(); i++) {
			total+= itens.get(i).subTotal();
		}
		return total;
	}
	
	
	//getters and setters
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public LocalDateTime getCurrentDateTime() {
		return currentDateTime;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
}
