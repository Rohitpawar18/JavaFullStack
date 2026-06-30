package streams;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MapStreamDemo {

	public static void main(String[] args) {

		Map<String, String> people = new HashMap<>();
		
		people.put("Polo", "Pune");
		people.put("Mili", "Mumbai");
		people.put("Deny", "Delhi");
		
//		people.values().stream().forEach(System.out::println);
//		people.keySet().stream().forEach(System.out::println);
		
		List<String> cities = people.values().stream()
									.map(c -> c.toUpperCase())
									.sorted()
									.collect(Collectors.toList());
		
//		cities.forEach(System.out::println);
		
		Map<String, List<String>> contacts = new HashMap<>();
		contacts.put("Frudo", Arrays.asList("1212-2424", "4545-6363"));
		contacts.put("Sean", Arrays.asList("2231-4423", "8899-9988", "4636-8737"));
		contacts.put("Ben", Arrays.asList("2782-4753", "7878-8787"));
		
//		contacts.values().stream()
//						 .flatMap(Collection::stream)
//						 .forEach(System.out::println);
		
		//print all phone numbers containing 8
//		contacts.values().stream()
//						 .flatMap(Collection::stream)
//						 .filter(s -> s.contains("8"))
//						 .forEach(System.out::println);
		
		// print all phone numbers removing "-"
		contacts.values().stream()
		 				 .flatMap(Collection::stream)
		 				 .map(s -> s.replace("-", ""))
		 				 .forEach(System.out::println);
	}

}
