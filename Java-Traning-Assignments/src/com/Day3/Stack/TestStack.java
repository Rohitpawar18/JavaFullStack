package com.Day3.Stack;

public class TestStack {

	public static void main(String[] args) {
		StackDemo stack = new StackDemo();
		
		System.out.println(stack.push(10));
		System.out.println(stack.push(20));
		System.out.println(stack.push(30));
		System.out.println(stack.push(40));
		
		System.out.println("\nTop Element : " + stack.peek());
		
		System.out.println("\nStack Elements : ");
		stack.display();
		
		System.out.println("\nPopped : " + stack.pop());
		
		System.out.println("\nAfter Pop : ");
		stack.display();
	}
}
