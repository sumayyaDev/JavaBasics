package newbos_InterJava_16;
import java.util.*;

public class HashSetProgram {

	public static void main(String[] args) {
		
		String[] things = {"apple", "chocolate", "Guava", "chocolate", "orange"};
		List<String> list = Arrays.asList(things);
		
		System.out.printf("%s ", list);
		System.out.println();
		
		Set<String> set = new HashSet<String>(list); //HashSet--> to remove any duplicate item from that original list 
		System.out.printf("%s ", set);
	}
}
