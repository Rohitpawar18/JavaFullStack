package com.cart;

public class TestShop {

	public static void main(String[] args) {
		
		Product p1 = new Product("Laptop",50000);
		Product p2 = new Product("Mouse",500);
		Product p3 = new Product("Phone",8000);
		Product p4 = new Product("Cooler",6000);
		Product p5 = new Product("TV",12000);
		Product p6 = new Product("Table",1000);
		
//		ShoppingCart sp = new ShoppingCart();
		Shopping sp = CartFactory.newCart();
		
		try {
			sp.addToCart(p1);
			sp.addToCart(p2);
			sp.addToCart(p3);
			sp.addToCart(p4);
			sp.addToCart(p5);
			sp.addToCart(p6);
			
		} catch (ShoppingCartException e) {
			e.printStackTrace();
//			System.out.println(e);
		}
		
		try {
			sp.checkout();
		} catch (ShoppingCartException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
