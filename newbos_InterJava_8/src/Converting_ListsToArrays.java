import java.util.*;
public class Converting_ListsToArrays {

	public static void main(String[] args) {
		
		String[] stuff = {"babies", "watermelon", "grapes", "blueberry"};
		LinkedList<String> theList = new LinkedList<String>(Arrays.asList(stuff));
		
		theList.add("strawberry");
		theList.addFirst("firstbaby");
		
		//Covert back to an array
		stuff = theList.toArray(new String[theList.size()]);
		
		for(String x : stuff)
			System.out.printf("%s ", x);
	}

}
