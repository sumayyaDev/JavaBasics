
import java.util.Scanner;
public class L4_Task5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("The amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double annualRate = input.nextDouble();
		double monthlyRate = annualRate / (12.0*100);
		final int YEARS = 30;
		System.out.println("Years\tFuture value");
		
		for(int i = 1; i <= YEARS; i++) {
			//System.out.println(i + "\t" + futureInvestmentValue(amount, monthlyRate, i));
			System.out.printf("%2d\t%.2f\n", i, futureInvestmentValue(amount, monthlyRate, i));
		}
	}
	public static double futureInvestmentValue(double investmentAmount, double monthlyInterestRate, int years) {
		
		return investmentAmount * Math.pow(1 + monthlyInterestRate, years*12);
	}

}
