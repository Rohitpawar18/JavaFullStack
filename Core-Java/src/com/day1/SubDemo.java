package com.day1;

public class SubDemo<T, D> extends Demo<T> {
	private D temp;
	
	public SubDemo(T data, D temp) {
		super(data);
		this.temp = temp;
	}
	public D getTemp() {
		return temp;
	}
	public void setTemp(D temp) {
		this.temp = temp;
	}
	
	public static void main(String[] args) {
//		Demo d1 = new Demo("Hola");
//		System.out.println(d1.getData());
//		
//		Demo d2 = new Demo(3.14);
//		System.out.println(d2.getData());
//		
//		Demo d3 = new Demo(new Person("Kim",22));
//		System.out.println(d3.getData());
			
//		Demo<String> d1 = new Demo<String>("Hello");  // Use the <T> any to apply Generics to avoid data type change through out execution
//		System.out.println(d1.getData());
		
		SubDemo<Integer, Person> d2 = new SubDemo<Integer, Person>(101, new Person("john",22));
		System.out.println(d2.getData() + " " + d2.getTemp());
	}
}
