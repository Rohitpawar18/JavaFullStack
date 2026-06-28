package com.Day2.Library;

public class Book {
	private String title;
	private Member mbr;
	
	public Book(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + "]";
	}
	
	public boolean issueBook(Member member) {
		if(mbr != null) {
			System.out.println(title + " is already issued to " + mbr);
			return false;
		}
		
		if(member.getBook() != null) {
			System.out.println(member + " alredy has a book");
			return false;
		}
		
		mbr = member;
		member.setBook(this);
		
		System.out.println(title + " is issued to " + member);
		return true;
	}
	
	public void returnBook() throws ReturnBookException{
		if(mbr == null) {
			throw new ReturnBookException(title + " is not issued to anyone.");
		}
		
		System.out.println(title + " returned by " + mbr);
		
		mbr.setBook(null);
		mbr = null;
	}
	
	public void status() {
		if(mbr == null) {
			System.out.println(title + " (available) not issues to any member.");
		}else {
			System.out.println(title + " issued to " + mbr);
		}
	}
}
