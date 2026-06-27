package com.Day1.Stock;

public class TestStock {

	public static void main(String[] args) {
		
//		Stock stock = new Stock();
		
		//Apply Singleton Design Pattern
		Broker broker = SingletonDemo.getStock();
		broker.getQuote();

		Exchange exchange = SingletonDemo.getStock();
		exchange.setQuote();
		
		Holder holder = SingletonDemo.getStock();
		holder.viewQuote();
		
		System.out.println(broker == exchange);
		System.out.println(holder == exchange);
	}

}
