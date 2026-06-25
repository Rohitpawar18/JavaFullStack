package com.day1;

public class Person implements Cloneable{
	
	private String name;
	private int age;
	
	public Person() {	
//		name = "Anonymous";
//		age = -1;
		this("Anonymous", -1);
	}
	
	public Person(String name, int age) {	
		this.name = name;
		this.age = age;
	}
	
	public void print() {
		System.out.println("Name : "+ name +", Age : "+age);
	}
	
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		
		if(obj instanceof Person) { //check the object is of the person class or not
			Person p = (Person) obj;
			
			if(this.age == p.age && name.equals(p.name)) {
				return true;
			}
		}
		return false;
	}

	
	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1 = new Person("Sam",22);
		p1.print();     
		Person p2 = new Person("Sam",22);
		p2.print();
		
		System.out.println("\n"+ p1.hashCode());
		System.out.println("\n"+ p2.hashCode() +"\n");
		
		System.out.println(p1); // implicitly calls toString() on object
		
		System.out.println(p1.equals(p2)); // equals() can compare the hash code
		
		Person pc = (Person) p1.clone(); // we need to implement Cloneable interface to sign aggrement
		System.out.println(pc);
	}
	
}
