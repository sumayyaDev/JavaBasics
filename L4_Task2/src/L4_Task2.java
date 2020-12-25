
import java.util.Scanner;
public class L4_Task2 {

	public static void main(String[] args) {
		// Write a method that computes the sum of the digits in an integer.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		long number = input.nextLong();
		int sumOfDigits = sumDigits(number);
		System.out.println("The sum of all the digits is " + sumOfDigits);
	}
	public static int sumDigits(long n) {
		int sum=0;
		while(n != 0) {
		long remainder = n % 10;
		sum += remainder;
		n = n / 10;
		
	}
		return sum;

  }
}