import java.util.Scanner;
public class displayMonth {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// Display month by it's number
		String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
		System.out.print("Enter the month number (1 to 12): ");
		int monthNumber = input.nextInt();
		System.out.println("The month is " + months[monthNumber - 1]);
	}

}
