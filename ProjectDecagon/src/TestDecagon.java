import java.util.Scanner;
public class TestDecagon {

	public static void main(String[] args) {
		 
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your NSU ID: ");
		int id = input.nextInt();
		int preDigit4 = id / 1000000;
		int digit4 = preDigit4 % 10;
		int preDigit7 = id / 1000;
		int digit7 = preDigit7 % 10;
		System.out.println("Your fourth digit of your NSU ID is: " + digit4);
		System.out.println("Your seventh digit of your NSU ID is: " + digit7);
		
		
		Decagon decagon = new Decagon(digit4, new RGB(255, 0, 0));
		Decagon anotherDecagon = new Decagon(digit7 , new RGB(0, 255, 0));
				
		System.out.println("\ndecagon.compareArea(anotherDecagon)? return value: " + decagon.compareArea(anotherDecagon));
		System.out.println("The area of the Decagon taking NSU 4th digit: " + decagon.getArea());
		System.out.println("The area of the Decagon taking NSU 7th digit: " + anotherDecagon.getArea());
		
		System.out.println("\n\\\\Decagon taking 4th digit of ID\\\\\n" + decagon.toString() + "\n[" + new RGB(255, 0, 0).toString() + "]");
		System.out.println("\n\\\\Decagon taking 7th digit of ID\\\\\n" + anotherDecagon.toString() + "\n[" + new RGB(0, 255, 0).toString() + "]");
	}

}
