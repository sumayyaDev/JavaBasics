import java.util.Scanner;
public class indexOfASpecifiedCharacter {

	public static void main(String[] args) {
		// Reading a character from the console
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a line: ");
		String s = input.nextLine();
		char ch = s.charAt(0);
		System.out.println("The character at index 0 is " + ch);
		

	}

}
