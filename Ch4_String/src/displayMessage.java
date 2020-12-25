import java.util.Scanner;
public class displayMessage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		String message = "Welcome to Java";
		System.out.println(message);
		
		
		  System.out.print("Enter three words separated by spaces: ");
		  String s1 = input.next();
		  String s2 = input.next();
		  String s3 = input.next();
		  
		  System.out.println("s1 is " + s1); System.out.println("s2 is " + s2);
		  System.out.println("s3 is " + s3);
		 
			/*
			 * System.out.print("Enter a line: ");
			 * String s = input.nextLine();			// Cannot use nextLine() after using next()
			 * System.out.println("The line entered is " + s);
			 */
		
	}

}
