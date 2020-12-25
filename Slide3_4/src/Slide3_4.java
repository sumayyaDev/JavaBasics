
import java.util.Scanner;
public class Slide3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int number = input.nextInt();
		
		System.out.println((number % 2 == 0) ? number + " is even" : number + " is odd");

	}

}
