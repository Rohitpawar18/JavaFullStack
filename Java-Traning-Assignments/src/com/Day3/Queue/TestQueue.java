package com.Day3.Queue;

public class TestQueue {

	public static void main(String[] args) {
		
		QueueDemo queue = new QueueDemo();
		
		System.out.println(queue.enqueue(10));
		System.out.println(queue.enqueue(20));
		System.out.println(queue.enqueue(30));
		System.out.println(queue.enqueue(40));
		
		System.out.println("\nDeqeued Element : " + queue.dequeue());
		System.out.println("\nDeqeued Element : " + queue.dequeue());
		
		System.out.println("\nFront Element : " + queue.peek());
	
		System.out.println("\nQueue Elements : ");
		queue.display();
	}
}
