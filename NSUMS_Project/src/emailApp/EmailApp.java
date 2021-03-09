package emailApp;

import java.util.Scanner;

public class EmailApp {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter how many email ID you want to create: ");
		int numOfEmail = input.nextInt();
		Email[] email = new Email[numOfEmail];
		for(int i = 0; i < numOfEmail; i++) {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter first name: ");
			String firstName = in.nextLine();
			System.out.print("Enter last name: ");
			String lastName = in.nextLine();
			email[i] = new Email(firstName, lastName);
		}
		
		for(int i = 0; i < numOfEmail; i++) {
			System.out.println(email[i].toString());
		}
		
	}

}
