
import java.util.Scanner;
public class L1_Task7 {

	public static void main(String[] args) {
		// Enter the amount of water in kilograms: 55.5
		// Enter the initial temperature: 3.5
		// Enter the final temperature: 10.5
		// The energy needed is 1625484.0
		// Q = M * (finalTemperature – initialTemperature) * 4184
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the amount of water in kilograms: ");
		double weightOfWater = input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialTemperature = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double finalTemperature = input.nextDouble();
		
		double energy = weightOfWater * (finalTemperature - initialTemperature) * 4184;
		System.out.println("The energy needed is " + energy);

	}

}
