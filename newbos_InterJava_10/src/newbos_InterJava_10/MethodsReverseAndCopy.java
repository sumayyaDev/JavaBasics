package newbos_InterJava_10;
import java.util.*;
public class MethodsReverseAndCopy {

	public static void main(String[] args) {
		
		//Create an array and convert to list
		Character[] ray = {'p', 'w', 'n'};
		List<Character> l = Arrays.asList(ray);
		System.out.println("list is : ");
		output(l);
		
		//reverse and print out the list
		Collections.reverse(l);
		System.out.println("After reverse the list : ");
		output(l);
		
		//Create a new array and a new list
		Character[] newRay = new Character[3];
		List<Character> listCopy = Arrays.asList(newRay);
		
		//copy contents of list into listcopy
		Collections.copy(listCopy, l);
		System.out.println("Copy of list : ");
		output(listCopy);
		System.out.println("newRay is : ");
		for(int i = 0; i < listCopy.size(); i++) {
			System.out.print(newRay[i] + " "); 
		}
		System.out.println();
		
		//Fill collections with crap
		Collections.fill(l, 'X');
		System.out.println("After filling the list : ");
		output(l);
		System.out.println("ray is : ");
		for(int i = 0; i < listCopy.size(); i++) {
			System.out.print(ray[i] + " "); 
		}
	}
	
	//Output method
	private static void output(List<Character> theList) {
		for(Character things : theList)
			System.out.printf("%s ", things);
		
		System.out.println();
	}
}
