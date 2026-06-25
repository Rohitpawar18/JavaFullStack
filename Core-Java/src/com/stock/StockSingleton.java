package com.stock;

public class StockSingleton {
	private static Stock instance;
	
	public static Stock getStock() {
		if(instance == null) {
			instance = new Stock();
		}
		return instance;
	}
}
