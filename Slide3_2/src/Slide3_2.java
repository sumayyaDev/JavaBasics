
import java.util.Scanner;
public class Slide3_2 {

	public static void main(String[] args) {
		// Write a program that displays grades
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your score: ");
		double score = input.nextDouble();
		
		if(score >= 90)
			System.out.println("GRADE = \'A\'");
		else if(score >= 80)
			System.out.println("GRADE = \'B\'");
		else if(score >= 70)
			System.out.println("GRADE = \'C\'");
		else if(score >= 60)
			System.out.println("GRADE = \'D\'");
		else
			System.out.println("GRADE = \'F\'");

	}

}
