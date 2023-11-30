package entities;

public class Product {

	private String name;
	private Double price;
	private Integer stock;
	private String description;
	
	//constructor
	public Product(String name, Double price, Integer stock, String description) {
		this.name = name;
		this.price = price;
		this.stock = stock;
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "Product [name=" + name + ", price=" + price + ", stock=" + stock + ", description=" + description + "]";
	}

	//getters, setters and others
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getStock() {
		return stock;
	}

	public void setStock(Integer stock) {
		this.stock = stock;
	}
	
	public void addStock(Integer quantity) {
		this.stock += quantity;
	}
	
	public void subStock(Integer quantity) {
		this.stock -= quantity;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
