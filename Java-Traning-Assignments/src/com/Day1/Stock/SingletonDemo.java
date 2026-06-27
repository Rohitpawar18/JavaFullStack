package com.Day1.Stock;

public class SingletonDemo {
	private static Stock instance;
	
	public static Stock getStock() {
		
		if(instance == null) {
			instance = new Stock();
		}
		return instance;
	}
}
