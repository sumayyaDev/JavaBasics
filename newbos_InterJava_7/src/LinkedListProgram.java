import java.util.*;

public class LinkedListProgram {

	public static void main(String[] args) {
		
		String[] things1 = {"apples", "oranges", "banana", "strawberry", "blueberry"};
		List<String> list1 = new LinkedList<String>();
		for(String x: things1) {
			list1.add(x);
		}
		
		String[] things2 = {"sausage", "bacon", "goats", "harrypotter"};
		List<String> list2 = new LinkedList<String>();
		for(String y: things2) {
			list2.add(y);
		}
		
		list1.addAll(list2); // Add list2 to list1
		list2 = null;
		
		printMe(list1);
		removeStuff(list1, 2, 5);
		printMe(list1);
		reverseMe(list1);
	}
	// printMe method
	public static void printMe(List<String> l) {
		for(String b: l) {
			System.out.printf("%s ", b);
		}
		System.out.println();
	}
	
	// removeStuff method
	public static void removeStuff(List<String> l, int from, int to) {
		l.subList(from, to).clear();
	}
	
	// reverseMe method
	public static void reverseMe(List<String> l) {
		ListIterator<String> sumu = l.listIterator(l.size());
		while(sumu.hasPrevious()) {
			System.out.printf("%s ", sumu.previous());
		}
	}
}
