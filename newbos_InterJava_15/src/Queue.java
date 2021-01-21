import java.util.*;
public class Queue {

	public static void main(String[] args) {
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		
		q.offer("first");
		q.offer("second");
		q.offer("third");
		
		System.out.printf("%s ", q);
		System.out.println();
		
		System.out.printf("%s ", q.peek()); //return highest priority element from the queue list(first in, first out) 
		System.out.println();
		
		q.poll();
		System.out.printf("%s ", q);
		System.out.println();
		
		q.poll();  //poll(find highest priority from the queue and remove it autometically)
		System.out.printf("%s ", q);
		System.out.println();
	}
}
