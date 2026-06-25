package com.ds;

public class StackTest {

	public static void main(String[] args) {

		StackDemo sd = new StackDemo();
		
		sd.push(50);
		sd.push(60);
		sd.push(70);
		
		System.out.println("\nStack Elements : ");
		sd.peek();
		System.out.println();
		sd.pop();
		sd.pop();
		
		System.out.println("\nStack Elements : ");
		sd.peek();
		System.out.println("Is Stack Empty? " + sd.isEmpty());
	}
}
