package com.day1;

// A interface having the SAM - Single Abstract Method is a Functional Interface
@FunctionalInterface
interface Hello{
	String greet();
	
	default void Demo() {
		System.out.println("Hello Demo " + Temp());
	}
	
	static void Test() {		
		System.out.println("Hello Test");
	}
	
	private String Temp(){
		return "Hello Temp";
	}
}

@FunctionalInterface
interface Printer{
	void print(String name);
}

public class LambdaDemo {
	public static void main(String[] args) {
		Hello h1 = () -> "Hello Lambda!";
		System.out.println(h1.greet());
		
		h1.Demo();
		Hello.Test();
		
		Hello h2 = () -> {
//			String msg = "Bonjour Lambda";
			return "Bonjour Lambda!";
		};
		
		System.out.println(h2.greet());
		
		Printer p1 = (name) -> System.out.println(name);
		p1.print("Rohit");
		
		Printer p2 = System.out::println; // :: this operator is known as Method Reference
		p2.print("Tushar");
	}
}
