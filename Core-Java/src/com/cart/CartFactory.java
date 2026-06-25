package com.cart;

public final class CartFactory {
	private CartFactory() {			// making the consructor private , so no one can make the object of this class
	}
	
	public static Shopping newCart() {
		return new ShoppingCart();
	}
}
