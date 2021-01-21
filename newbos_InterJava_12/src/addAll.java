import java.util.*;
public class addAll {

	public static void main(String[] args) {
		
		//convert stuff array to a list
		String[] stuff = {"apples", "beef", "corn", "ham"};
		List<String> list1 = Arrays.asList(stuff);
		
		ArrayList<String> list2 = new ArrayList<String>();
		list2.add("youtube");
		list2.add("google");
		list2.add("digg");
		for(String x : list2)
			System.out.printf("%s ", x);
		System.out.println();
		
		Collections.addAll(list2, stuff);
		for(String x : list2)
			System.out.printf("%s ", x);
		System.out.println();
		
		// frequency , disjoint
		System.out.println(Collections.frequency(list2, "digg"));
		
		boolean tof = Collections.disjoint(list1, list2);
		System.out.println(tof);
		
		if(tof) //if tof == true
			System.out.println("These lists do not have anything in common.");
		else  //tof == false
			System.out.println("These lists must have anything in common.");	
	}
}
