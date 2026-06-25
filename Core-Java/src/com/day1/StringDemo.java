package com.day1;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1 = "Hello";
		String s2 = new String("hello");
		String s3 = "Hello";
		
		System.out.println(s1 == s2);
		System.out.println(s1 == s3);
		System.out.println();
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		s1 = s1 + " world";
		System.out.println(s1);
		
		String name = "Rohit";
		String nameRegex = "[A-Z]{1}[a-z]{3,}";
		System.out.println("Name Regex = "+ name.matches(nameRegex));
		
		String cell = "5669645352";
		String cellRegex = "[6-9]{1}[0-9]{1,9}";  // optional regex "[6-9][0-9]{9}"
		System.out.println("Phone number Regex = "+cell.matches(cellRegex));
		
		String email = "rohit123@gmail.com";
		String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
		System.out.println("Email Regex = "+email.matches(emailRegex));
	}
}
