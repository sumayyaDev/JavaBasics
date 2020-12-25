
import java.util.Scanner;
public class Slide3_3 {

	public static void main(String[] args) {
		// Write a program that first prompts the user to enter a year as an int value and checks if it is a leap year or not.
	    Scanner input = new Scanner(System.in);
		
	    System.out.print("Enter the year: ");
	    int yearNumber = input.nextInt();
		
	    if((yearNumber % 4 == 0 && yearNumber % 100 != 0) || (yearNumber % 400 == 0))
	    	System.out.println("The year " + yearNumber + " is a leap year");
	    else
	    	System.out.println("The year " + yearNumber + " is a not leap year");

	}

}
