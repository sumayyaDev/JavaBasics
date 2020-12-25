
import java.util.Scanner;
public class L4_Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter an integer number: ");
		int number = input.nextInt();
		boolean isReversedNum = isPalindrome(number);
		System.out.print(isReversedNum);
	}
	public static int reverse(int number) {
		int reversedNum = 0;
		while(number != 0) {
			int remainder = number % 10;
			reversedNum =(reversedNum*10) + remainder;
			number = number /10;
		}
		return reversedNum;
	}
	public static boolean isPalindrome(int number) {
		int num = number;
		int reversedNum = reverse(num);
		boolean result;
		if(reversedNum == number) { 
			result = true;
			System.out.print("The number " + number + " is Palindrome. ");
		}
		else {	
			result = false;
			System.out.print("The number " + number + " is not Palindrome. ");

	}
		return result;
	}
}
