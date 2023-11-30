package entities;

public class OrderItem {
	private Double price;
	private Integer quantity;
	//product
	private Product product;
	
	//constructor
	public OrderItem(Double price, Integer quantity, Product product) {
		this.price = price;
		this.product = product;
		
		if(product.getStock()<quantity) {
			System.out.println("Insuficient stock of the selected product. Changing the quantity to the maximum stock available.");
			this.quantity = product.getStock();
		}else {
			this.quantity = quantity;
		}
		//removing product from stock, since it have been sold in this order
		this.product.subStock(this.quantity);
	}
	
	public OrderItem() {
	}

	//toString
	@Override
	public String toString() {
		return "OrderItem [price=" + price + ", quantity=" + quantity + ", product=" + product + "]";
	}

	//get subtotal (price * quantity)
	public Double subTotal() {
		return (double)this.price*this.quantity;
	}
	//getters and setters
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	
}
