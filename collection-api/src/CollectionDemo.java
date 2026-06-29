import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.TreeSet;

public class CollectionDemo {

	public static void main(String[] args) {
		
		LinkedList<String> lst = new LinkedList<>();
		lst.add("Microsoft");
		lst.add("Google");
		lst.addFirst("Apple");
		lst.addLast("Apache");
		lst.add(1, "Oracle");
		
		System.out.println("=== Traversing Using for Loop ===");
		for(int i = 0; i < lst.size(); i++) {
			System.out.println(lst.get(i));
		}
		
		System.out.println("\n=== Traversing Using Iterator ===");
		Iterator<String> itr = lst.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("\n=== Traversing Using for-each ===");
		for(String s : lst) {
			System.out.println(s);
		}
		
		System.out.println("\n === Traversing Using for-each Method ===");
		lst.forEach(System.out::println);  // :: method reference
		
		
		ArrayList<String> ar = new ArrayList<>();
		ar.add("IBM");
		ar.add("Apple");
		ar.add("JBoss");
		
		ar.addAll(lst);	// merging collection into another
		System.out.println("\n=== Traversing over merged Collection ===");
		for(String s : ar) {
			System.out.println(s);
		}
		
		// converting ArrayList to HashSet
		HashSet<String> set = new HashSet<>(ar);
		System.out.println("\n=== Traversing over set collection ===");
		for(String s : set) {
			System.out.println(s);
		}
			
		// Converting HashSet to TreeSet
		TreeSet<String> tree = new TreeSet<>(set);
		System.out.println("\n=== Traversing over Sorted collection ===");
		for(String s : tree) {
			System.out.println(s);
		}
	}

}
