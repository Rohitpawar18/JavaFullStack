package com.day1;

public class Car {
	private String model;
	private String[] features;
	
	// Var-args : can only be the last  argument of the method
	public Car(String model, String... features) { // it called variable-arguments
		this.model = model;
		this.features = features;
	}
	
	public void specs() {
		System.out.println("Feature of : "+ model);
		for(String f : features) {
			System.out.println(f);
		}
	}
	
	public static void main(String[] args) {
//		String[] features = {"Speed","Accuracy","Comfort"};
		Car c = new Car("MG Astor","Speed","Accuracy","Comfort");
		c.specs();
	}
}
