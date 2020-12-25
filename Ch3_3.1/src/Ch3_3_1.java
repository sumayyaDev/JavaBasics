
import java.util.Scanner;
public class Ch3_3_1 {

	public static void main(String[] args) {
		/* Write a program that randomly generates two single-digit integers, number1 and number 2,
		and displays a question such as "What is 1 + 7?"*/
		Scanner input = new Scanner(System.in);
		
		int number1 = (int) (System.currentTimeMillis() % 10);      // generate number1
		int number2 = (int) (System.currentTimeMillis() / 7 % 10);  // generate number2
		
		System.out.println("What is "+ number1 + "+" + number2 + "?");
		
		int answer = input.nextInt();
		
		System.out.println(number1 + "+" + number2 + "=" + answer + " is " + (number1+number2==answer));
				

	}

}
