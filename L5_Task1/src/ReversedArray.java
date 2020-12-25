
import java.util.Scanner;
public class ReversedArray {

	public static void main(String[] args) {
		/*
		 * (Reverse the numbers entered) Write a program that reads ten integers and
		 * displays them in the reverse of the order in which they were read.
		 */
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter ten integers: ");
		int[] array = new int[10];
		
		for(int i = 0; i < 10; i++) {
			array[i] = input.nextInt();
		}
		System.out.print("The original array is: ");
		for(int i = 0; i < 10; i++)
			System.out.print(array[i] + " ");
		
		System.out.print("\nThe reversed array is: ");	
		for(int i = array.length - 1; i >= 0; i--) {
			System.out.print(array[i] + " ");
		}
		
	}

}
