import java.util.InputMismatchException;
import java.util.Scanner;
public class IntegerInputException {

	public static void main(String[] args) {
		/**
		 * (InputMismatchException) Write a program that prompts the user to read two integers and 
		 * displays their sum.
		 * prompt the user to read the number again if the input is incorrect.
		 */
		Scanner input = new Scanner(System.in);
		boolean continueInput = true;
		do {
			try {
				System.out.print("Enter two integers: ");
				int integer1 = input.nextInt();
				int integer2 = input.nextInt();
				int sum = (integer1 + integer2);
				System.out.println("the sum is: " + sum);
				continueInput = false;
			}
			catch(InputMismatchException ex){
				System.out.println("Try again (Incorrect input: integer is required)");
				input.nextLine(); // Discard input
			}
		}while(continueInput);
	}

}
