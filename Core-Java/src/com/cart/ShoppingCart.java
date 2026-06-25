package com.cart;

import java.util.LinkedList;

//import com.ds.LinkedList;

public class ShoppingCart implements Shopping{
	
	private LinkedList<Product> items;
	private double total;
	private int i = 0;
	public ShoppingCart() {
		items = new LinkedList<Product>();
	}
	
	public void addToCart(Product p) throws ShoppingCartException{
		if(items.size() == 5) {
			throw new ShoppingCartException("Sorry! Cart is Full.");
		}
		
		items.add(p);
		total += p.getPrice();
		System.out.println("Product Added To Cart!");
	}
	
	public void checkout() throws ShoppingCartException{
		if(items.size() == 0) {
			throw new ShoppingCartException("Your cart is empty!");
		}
	
		System.out.println("Products : ");
//		items.print();
//		for (int i = 0; i < items.size(); i++) {
//			System.out.println(items.get(i));
//		}
		for(Product p : items) {
			System.out.println(p);
		}
		System.out.println("\nCart Total : "+total);
	}
	
}
