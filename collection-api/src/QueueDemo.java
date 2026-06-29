import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<>();
		
		que.add("Apple");
		que.offer("Banana");
		que.offer("Cherry");
		
		System.out.println(que.peek()); 	// Fetch value but doesn't remove
		
		while(!que.isEmpty()) { // fetch value and remove from queue
			System.out.println(que.poll());
		}
		
		// Deque
		Deque<String> dque = new LinkedList<>();
		
		dque.add("pineapple");
		dque.offer("Orange");
		System.out.println("\nDeque implementation \n");
		System.out.println(dque.peek());	//fetch but doesn't remove
		
		while(!dque.isEmpty()) {
			System.out.println(dque.poll());	// fetch and remove
		}
		
		System.out.println(dque.poll());
	}

}
