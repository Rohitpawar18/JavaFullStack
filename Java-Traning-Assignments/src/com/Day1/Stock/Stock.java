package com.Day1.Stock;

public class Stock implements Broker, Exchange, Holder{
	
	public void getQuote() {
		System.out.println("Get Quote");
	}
	
	public void setQuote() {
		System.out.println("Set Quote");
	}
	
	public void viewQuote() {
		System.out.println("View Quote");
	}
}
