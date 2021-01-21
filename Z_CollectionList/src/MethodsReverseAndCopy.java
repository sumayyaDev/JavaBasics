import java.util.*;
public class MethodsReverseAndCopy {

	public static void main(String[] args) {
		
		// Create an array('s', 'u', 'y') & convert it into list
		Character[] arr = {'s', 'u', 'y'};
		List<Character> lissst = Arrays.asList(arr);
		System.out.print("List is: ");
		output(lissst);
		
		//reverse the list
		Collections.reverse(lissst);
		System.out.print("After reverse : ");
		output(lissst);
		
		//copy the list
		List<Character> copyList = Arrays.asList(arr);
		Collections.copy(copyList, lissst);
		System.out.print("copyList : ");
		output(copyList);
		
		//Filling the list
		Collections.fill(lissst, 'm');
		System.out.print("filling list : ");
		output(copyList);
	}
	
	private static void output(List<Character> theList) {
		for(Character items : theList)
			System.out.printf("%s ", items);
		System.out.println();
	}

}
