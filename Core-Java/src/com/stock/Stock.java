package com.stock;

public class Stock implements Holder, Broker, Exchange {
	
	public void viewQuote() {
		System.out.println("View Quote");
	}
	
	public void getQuote() {
		System.out.println("Get Quote");
	}
	
	public void setQuote() {
		System.out.println("Set Quote");
	}
}
