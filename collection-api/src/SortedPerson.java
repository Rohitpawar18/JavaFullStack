import java.util.Comparator;
import java.util.TreeSet;

public class SortedPerson {

	public static void main(String[] args) {

		Comparator<Person> ageComp = (p1, p2) -> p1.getAge() - p2.getAge();
		Comparator<Person> nameComp = (n1, n2) -> n1.getName().compareTo(n2.getName());
		
		TreeSet<Person> people = new TreeSet<Person>();
		people.add(new Person("Polo", 24));
		people.add(new Person("Mona", 31));
		people.add(new Person("Jack", 21));

		people.forEach(System.out::println);
	}

}
