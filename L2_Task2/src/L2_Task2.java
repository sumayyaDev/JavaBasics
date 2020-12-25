
public class L2_Task2 {

	public static void main(String[] args) {
		// Write a program that randomly generates an integer between 1 and 12 and 
		//displays the English month name January, February, ..., December for the number 1, 2, ..., 12, accordingly.
		int monthNumber = (int)Math.round(Math.random() * 12);
		System.out.println("The number of month is: " + monthNumber);
		
		if(monthNumber == 1)
			System.out.println("Month Name: January");
		else if(monthNumber == 2)
			System.out.println("Month Name: February");
		else if(monthNumber == 3)
			System.out.println("Month Name: March");
		else if(monthNumber == 4)
			System.out.println("Month Name: April");
		else if(monthNumber == 5)
			System.out.println("Month Name: May");
		else if(monthNumber == 6)
			System.out.println("Month Name: June");
		else if(monthNumber == 7)
			System.out.println("Month Name: July");
		else if(monthNumber == 8)
			System.out.println("Month Name: August");
		else if(monthNumber == 9)
			System.out.println("Month Name: September");
		else if(monthNumber == 10)
			System.out.println("Month Name: October");
		else if(monthNumber == 11)
			System.out.println("Month Name: November");
		else if(monthNumber == 12)
			System.out.println("Month Name: December");
		else
			System.out.println("You could not randomly generates an integer between 1 and 12");
			
	}

}
