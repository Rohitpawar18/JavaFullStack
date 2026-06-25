package com.ds;

public class QueueDemo {
	private static class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data = data;
			this.next = null;
		}
	}
	
	private Node front = null;
	private Node rare = null;
	
	public void enqueue(int value) {
		Node n = new Node(value);
		
		if(isEmpty()) {
			front = n;
			rare = n;
		}else {
			rare.next = n;
			rare = n;
		}
		System.out.println("Enqueued : "+value);
	}
	
	public void dequeue() {
		if(isEmpty()) {
			System.out.println("Queue Underflow!");
			return;
		}
		
		System.out.println("Dequeued : " + front.data);
		front = front.next;
		
		if(front == null) {
			rare = null;
		}
	}
	
	public void peek() {
		if(isEmpty()) {
			System.out.println("Queue is Empty.");
			return;
		}
		
		System.out.println(front.data);
	}

	public boolean isEmpty() {
		return (front == null);
	}
}
