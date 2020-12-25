
import java.util.Scanner;
public class Slide3_1 {

	public static void main(String[] args) {
		/* Write a program that prompts the user to enter an integer. If the
		number is a multiple of 5, print HiFive. If the number is divisible
		by 2, print HiEven.*/
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int number = input.nextInt();
		
		if(number % 5 == 0)
			System.out.println("HiFive");
		if(number % 2 == 0)
			System.out.println("HiEven");
			
			

	}

}
