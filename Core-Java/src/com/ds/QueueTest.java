package com.ds;

public class QueueTest {

	public static void main(String[] args) {
		
		QueueDemo qd = new QueueDemo();
		
		qd.enqueue(10);
		qd.enqueue(20);
		qd.enqueue(30);
		System.out.println();
		qd.dequeue();
		qd.dequeue();
		System.out.println("\nQueue Elements : ");
		qd.peek();
		System.out.println("Is queue empty? " + qd.isEmpty());
	}

}
