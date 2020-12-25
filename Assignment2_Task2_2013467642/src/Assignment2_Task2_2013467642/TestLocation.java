package Assignment2_Task2_2013467642;

import java.util.Scanner;
public class TestLocation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the number of rows and columns in the array: ");
		int numberOfRows = input.nextInt();
		int numberOfColumns = input.nextInt();
		double[][] array = new double[numberOfRows][numberOfColumns];
		System.out.println("Enter the array: ");
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		// Call the locateLargest method and print out the desired information
		Location location = locateLargest(array); // The instance "loc" assign here
		System.out.println("The location of the largest element is " + location.maxValue + " at (" + location.row + ", " + location.column + ")"); 
	}
		
		// Here I need to return an instance of location
		public static Location locateLargest(double[][] array) {
			Location loc = new Location();  // Making instance here
			// Load it up                    
	        loc.row = 0;
	        loc.column = 0; 
	        loc.maxValue = array[0][0];
	        for(int i = 0; i < array.length; i++) {
	        	for(int j = 0; j < array[i].length; j++) {
	        		if(array[i][j] > loc.maxValue) {
	        			loc.row = i;
	        			loc.column = j;
	        			loc.maxValue = array[i][j]; 
	        		}
	        	}
	        }
        	return loc; // return the instance	
		}
}
