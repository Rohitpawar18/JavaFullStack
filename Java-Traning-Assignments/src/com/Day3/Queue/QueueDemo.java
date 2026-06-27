package com.Day3.Queue;

public class QueueDemo {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = next;
		}
	}
	
	private Node front = null;
	private Node rare = null;
	
	public int enqueue(int value) {
		Node node = new Node(value);
		
		if(isEmpty()) {
			front = rare = node;
		}else {
			rare.next = node;
			rare = node;
		}
		return rare.data;
	}
	
	public int dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow!");
			return -1;
		}
		
		int removedData = front.data;
		front = front.next;
		
		if(front == null)
			rare = null;
		
		return removedData;
	}
	
	public int peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return -1;
		}
		
		return front.data;
	}
	
	public void display() {
		if(isEmpty()) {
			System.out.println("Queue is Empty!");
			return ;
		}
		
		Node temp = front;
		while(temp != null) {
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	public boolean isEmpty() {
		return front == null;
	}
}
