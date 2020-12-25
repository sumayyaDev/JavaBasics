
import java.util.Scanner;
public class Ch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number = input.nextInt();
		
		if(number % 2 == 0)
			System.out.println(number + " is even.");
		
		System.out.println(number + " is odd.");

	}

}
