import java.util.*;
public class ArrayIndexOutOfBoundsExceptionDemo {

	public static void main(String[] args) {
		/**
		 * (ArrayIndexOutOfBoundsException) Write a program that meets the following requirements:
		 * Creates an array with 100 randomly chosen integers.
		 * Prompts the user to enter the index of the array, then displays the corresponding element value. 
		 * If the specified index is out of bounds, display the message Out of Bounds.
		 */
		Scanner input = new Scanner(System.in);
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = i;
		}
		
		boolean continueInput = true;
		do {
			try {
				System.out.print("Enter the index of the array, then we will display the corresponding element value: ");
				int index = input.nextInt();
				System.out.println("The element value of array[" + index + "]: " + array[index]);
				continueInput = false;
			}
			catch(ArrayIndexOutOfBoundsException ex){
				System.out.println("ArrayIndexOutOfBoundsException (The index number should be 0 to 99)"
						+ "\nTry again: ");
				input.nextLine();
			}
		}while(continueInput);		
	}
}
