import java.util.ArrayList;

public class ArrayListWithObject {

	public static void main(String[] args) {
		/* (Use ArrayList) Write a program that creates an ArrayList and 
		 * adds a Loan object, a Date object, a string, and a Circle object to the list, 
		 * and use a loop to display all the elements in the list by invoking the object’s toString() method.*/
		ArrayList<Object> objectList = new ArrayList<Object>();
		objectList.add(new Loan());
		objectList.add(new Date());
		objectList.add(new String("String class"));
		objectList.add(new Circle());
		
		for(int i = 0; i < objectList.size(); i++) {
			System.out.println((objectList.get(i)).toString());
		}

	}

}
