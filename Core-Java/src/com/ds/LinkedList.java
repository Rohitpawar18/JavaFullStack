package com.ds;

public class LinkedList<T> {
	private class Node{
		private T data;
		public Node next;
		
		public Node(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
	}
	
	private Node head, last;
	private int size;
	
	public void add(T data) {
		Node n = new Node(data);
		
		if(head == null) {
			head = last = n;
		}else { 
			last.next = n;
			last = n;
		}
		size++;
	}
	
	public void insert(int idx, T data) {
		if(idx > size) {
			throw new IllegalArgumentException("Index out of bound");
		}
		
		Node n = new Node(data);
		if(idx == 0) {
			n.next = head;
			head = n;
		}else {
			Node t = head;
			for(int i = 0; i < idx - 1; i++) {
				t = t.next;
			}
			n.next = t.next;
			t.next = n;
		}
		size++;
	}
	
	public void remove(int idx) {
		if(head == null) System.out.println("List is already empty");
		else if(idx == 0) {
			head = head.next;
		}else {		
			Node t1 = head;
			Node t2 = head.next;
			for(int i = 0; i < idx - 2; i++) {
				t1 = t1.next;
				t2 = t2.next;
			}
			if(t1.next == last) {
				last = t1;
			}else {
				t2.data = null;
				t1.next = t2.next;
			}
		}
		size--;
	}
	
	public void print() {
		if(head == null) {
			System.out.println("List is empty");
		}
		
		Node temp = head;
		while(temp != null) {
			System.out.println(temp.getData());
			temp = temp.next;
		}
	}

	public int getSize() {
		return size;
	}
}
