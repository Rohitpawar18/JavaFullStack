package com.day1;

import com.emp.Clerk;
import com.emp.Employee;
import com.emp.Manager;

public class TestEmployee {
	
	public static void main(String[] args) {
		
//		Employee emp = new Employee(10000);
//		System.out.println(emp.getSalary());
		
		Manager m = new Manager(20000, 400);
//		System.out.println(m.getSalary());
		
		Clerk c = new Clerk(30000, 150);
//		System.out.println(c.getSalary());
		
//		Employee e = c;
//		System.out.println(e.getSalary());
		showSalary(m);
		showSalary(c);
	}

	private static void showSalary(Employee e) {
		if(e instanceof Manager)
			System.out.println("Manager Salary : " + e.getSalary());
		else
			System.out.println("Clerk Salary : " + e.getSalary());
	}
	
//	private static void showSalary(Clerk c) {
//		System.out.println("clerk Salary : " + c.getSalary());
//	}
//
//	private static void showSalary(Manager m) {
//		System.out.println("Employee Salary : " + m.getSalary());
//	}
	
}
