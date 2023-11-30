package program;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		//date formatter
		SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

		//creating the orders list
		List<Order> orderList = new ArrayList<>();
		
		//creating products in stock
		List<Product> products = new ArrayList<>();
		
		//adding products in stock to the product list
		Product teethbrush = new Product("Teethbrush", 9.90, 10, "Extra soft teethbrush");
		products.add(teethbrush);
		Product airsoft = new Product("Airsfot", 79.90, 2, "1911 airsoft pistol");
		products.add(airsoft);
		
		//creating the client that will buy
		Client flavio = new Client("Flavio", "flavio@flavio.com", format.parse("20/11/2000"));
		
		//creating OrderItem, that is a class that have one Product with a price to pay 
		OrderItem firstOrderItem = new OrderItem(9.80, 2, teethbrush);
		System.out.println("Teethbrush stock: " + teethbrush.getStock() + " [result needs be 8]");
		OrderItem secondOrderItem = new OrderItem(79.90, 2, airsoft);
		
		//making the first order in the order list
		orderList.add(new Order(flavio, firstOrderItem));
		
		//making the second order with a list of OrderItem instead of just one OrderItem object
		List<OrderItem> orderItens = new ArrayList<>();
		orderItens.add(firstOrderItem);
		orderItens.add(secondOrderItem);
		
		orderList.add(new Order(flavio, orderItens));
		System.out.println(orderList);
	}

}
