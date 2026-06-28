package com.Day2.Library;

public class TestLibrary {

	public static void main(String[] args) {

		Book book1 = new Book("Wings Of Fire");
		Book book2 = new Book("Kite Runner");
		
		Member member1 = new Member("Soham");
		Member member2 = new Member("Rohan");
		
		book1.status();
		member1.status();
		book2.status();
		member2.status();
		
		//Issue book to member
		System.out.println("\nIssuing Book To Member : ");
//		book1.issueBook(member1);
		book2.issueBook(member2);
		
		System.out.println("\nBook Issued Status : ");
		book1.status();
		member1.status();
		book2.status();
		member2.status();
		
		//try to issue book which is alredy issued
		book1.issueBook(member2);
		
		//return book and print status
		System.out.println("\nReturning the book : ");
		try {
			book1.returnBook();
		} catch (ReturnBookException e) {
//			e.printStackTrace();
			System.out.println(e);
		}
		book1.status();
		member1.status();
	}
}
