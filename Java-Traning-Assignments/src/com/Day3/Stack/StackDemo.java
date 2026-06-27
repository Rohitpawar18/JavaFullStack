package com.Day3.Stack;

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
	
	public int push(int value) {
		Node node = new Node(value);
		node.next = top;
		top = node;
		return top.data;
	}
	
	public int pop() {
		if(isEmpty()) {
			System.out.println("Stack Underflow!");
			return -1;
		}
		
		int removedData = top.data;
		top = top.next;
		return removedData;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return -1;
		}
		
		return top.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Stack is Empty!");
			return;
		}
		
		Node temp = top;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return top == null;
	}
}
