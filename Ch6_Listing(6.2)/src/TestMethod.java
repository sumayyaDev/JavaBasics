import java.util.Scanner;
public class TestMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter score: ");
		double score1 = input.nextDouble();
		System.out.println("Your grade is " + printGrade(score1));
		
		System.out.print("Enter score: ");
		double score2 = input.nextDouble();
		System.out.println("Your grade is " + printGrade(score2));

	}
	public static char printGrade(double score) {
		
		if(score >= 90)
		   return 'A';
		else if(score >= 80)
			return 'B';
		else if(score >= 70)
			return 'C';
		else if(score >= 60)
			return 'D';
		else
			return 'F';
	}

}
