import java.util.Scanner;

public class arrayCalcculation {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Summing all elements of an array
		System.out.print("Enter the array size: ");
		int size = input.nextInt();
		double[] myArray = new double[size];

		double sum = 0;
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = input.nextDouble();
			sum += myArray[i];
		}
		System.out.println("The sum of the all elements of the array is " + sum);

		// Finding the largest element from the array
		/*
		 * double max = myArray[0]; for(int i =1; i < myArray.length; i++) {
		 * if(myArray[i] > max) { max = myArray[i]; } }
		 * 
		 * System.out.println("The largest element of the array is " + max);
		 */

		// Finding the smallest index of the largest element of the array
		double max = myArray[0];
		int indexOfMax = 0;
		for(int i = 1; i < myArray.length; i++) {
			if(myArray[i] > max) {
				max = myArray[i];
				indexOfMax = i;
			}
		}
	    System.out.println("The largest element is " + max + "\nThe smallest index of the largest element is " + indexOfMax);					
	}
}
