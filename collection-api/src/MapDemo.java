import java.util.HashMap;

public class MapDemo {
	public static void main(String[] args) {
		
		HashMap<String, String> map = new HashMap<>();
		
		map.put("Scott", "tiger");
		map.put("Jack", "Jill");
		map.put("Polo", "Lili");
		map.put("Rock", "Rose");
		
		System.out.println("Scott : " + map.get("Scott"));
		System.out.println("Polo : " + map.get("Polo"));
		System.out.println("Jack : " + map.get("Jack"));
	
		// print key and values without manually feeding keys
		System.out.println("\nprint key and values without manually feeding keys");
		for(String key : map.keySet()) {
			System.out.println(key + " - " + map.get(key));
		}
		
		map.forEach((key, value) -> System.out.println(key + " : " + value));
	}
}
