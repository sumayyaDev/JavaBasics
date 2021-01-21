import java.util.ArrayList;
import java.util.Scanner;
public class sumArrayList {

	public static void main(String[] args) {
		/* (Sum ArrayList) Write the following method that returns the sum of all numbers in an ArrayList:
         * public static double sum(ArrayList<Double> list)
         * Write a test program that prompts the user to enter 5 numbers, stores them in an array list, and displays their sum.
         */
		Scanner input = new Scanner(System.in);
		
		ArrayList<Double> list = new ArrayList<Double>();
		
		System.out.print("Enter 5 numbers: ");
		for(int i = 0; i < 5; i++) {
			list.add(input.nextDouble());
		}
		
		System.out.println("Sum of list: " + sum(list));
	}
	
	public static double sum(ArrayList<Double> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		return sum;
	}

}
