package com.ds;

public class StackDemo {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node top = null;
	
	public void push(int value) {
		Node n = new Node(value);
		n.next = top;
		top = n;
		System.out.println("Pushed : " + value);
	}
	
	public void pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
			return;
		}
		
		System.out.println("Popped element: " + top.data);
		top = top.next;
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty.");
			return;
		}
		
		System.out.println(top.data);
	}
	
	public boolean isEmpty() {
		return (top == null);
	}
}
