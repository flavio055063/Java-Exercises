package entities;

public class SoldItem {
	String name;
	Double price;
	Integer quantity;
	
	public SoldItem(String name, Double price, Integer quantity){
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public SoldItem() {
	}

	@Override
	public String toString() {
		return "SoldItem [name=" + name + ", price=" + price + ", quantity=" + quantity + ", TOTAL: " + price*quantity + "]";
	}
	
}
