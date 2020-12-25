
import java.util.Scanner;
public class L2_Task4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a three-digit: ");
		int number = input.nextInt();
		int temp = number;
		int sum = 0, remainder;
		
		while(number>0) {
			remainder = number % 10;
			sum = (sum*10) + remainder;
			number = number / 10;	
		}
		if(temp == sum)
			System.out.println(temp + " is a palindromme.");
		else
			System.out.println(temp + " is not a palindromme.");
	}

}
