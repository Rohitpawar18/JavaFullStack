package com.lib;

public class TestLibrary {

	public static void main(String[] args) {
		
		Book b1 = new Book("The Alchemist");
		Book b2 = new Book("Kite Runner");

		Member m1 = new Member("George");
		Member m2 = new Member("Martha");
	
		b1.status();
		m1.Status();
		b2.status();
		m2.Status();
		
//		System.out.println();
//		//Issue Book to member
//		System.out.println("Issuing Book to memeber :");
//		b1.issueBook(m1);
//		b2.issueBook(m2);
//		
//		// Print their status
//		System.out.println("\nBook Issued Status :");
//		b1.status();
//		m1.Status();
//		b2.status();
//		m2.Status();
		
		 //Return book from Member
		System.out.println("\nReturning the book :");
		try {
			b1.returnBook();
		} catch (ReturnBookException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		
//		System.out.println("\nAfter return book status :");
//		b1.status();
//		m1.Status();
//		
//		System.out.println("\nAlready have Book but, Trying to issue book :");
//		b1.issueBook(m2);
//		
//		System.out.println("\nTrying to issue book which is already issued by another member :");
//		b2.issueBook(m1);
	}

}
