package com.ds;

public class TestLinkedList {

	public static void main(String[] args) {
		LinkedList<Integer> list = new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		
		list.insert(2, 25);
		list.insert(3, 28);
		list.insert(0, 5);
		list.insert(5, 35);
		
		list.remove(7);
		list.add(40);
		list.print();
	}

}
