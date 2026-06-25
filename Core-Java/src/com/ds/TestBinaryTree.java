package com.ds;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree bt = new BinaryTree();
		
		bt.add(50);
		bt.add(30);
		bt.add(40);
		bt.add(70);
		bt.add(25);
		
		System.out.println("Pre Order Traversal : ");
		bt.traverse();
	}
}
