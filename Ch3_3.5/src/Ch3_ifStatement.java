
import java.util.Scanner;
public class Ch3_ifStatement {

	public static void main(String[] args) {
		// increase pay by 3% if score is greater than 90.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the score: ");
		double score = input.nextDouble();
		System.out.print("Enter the pay: ");
		double pay = input.nextDouble();
		
		if(score>90) {
			pay = pay + (3 / 100.0) * pay;
			System.out.println("Pay = " + pay);
		}
		else
			System.out.println("Pay = " + pay);
		
	}

}
