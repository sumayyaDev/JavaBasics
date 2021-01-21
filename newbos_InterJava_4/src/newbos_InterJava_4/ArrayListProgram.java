package newbos_InterJava_4;
import java.util.*;
public class ArrayListProgram {

	public static void main(String[] args) {
		String[] items = {"panir", "pizza", "coke", "cake", "beer"};
		List<String> list1 = new ArrayList<String>();
		//add array items to list1
		for(String x: items) {
			list1.add(x);
		}
		
		String[] moreItems = {"pizza", "cake"};
		List<String> list2 = new ArrayList<String>();
		// add array moreItems to list2
		for(String y: moreItems) {
			list2.add(y);
		}
		
		for(int i = 0; i < list1.size(); i++) {
			System.out.print(list1.get(i) + " ");
		}
		System.out.println();
		for(int i = 0; i < list2.size(); i++) {
			System.out.print(list2.get(i) + " ");
		}
		
		System.out.println();
		editList(list1, list2);
		for(int i =0; i< list1.size(); i++) {
			System.out.printf("%s ", list1.get(i));
		}
		
	}
	
	public static void editList(Collection<String> l1, Collection<String> l2) {
		Iterator<String> it = l1.iterator();
		while(it.hasNext()) {
			if(l2.contains(it.next()))
				it.remove();
		}
	}

}
