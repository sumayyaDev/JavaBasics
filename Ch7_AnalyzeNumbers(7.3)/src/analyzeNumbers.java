import java.util.Scanner;
public class analyzeNumbers {

	public static void main(String[] args) {
		/*
		 * (i) Let the user enter the number of input 
		 * (ii) Get the average of these numbers
		 * (iii)Find the number of items greater than the average
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of items: ");
		int n = input.nextInt();
		double[] numbers = new double[n];
		System.out.print("Enter the numbers: ");
		double sum = 0;
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = input.nextDouble();
			sum += numbers[i];
		}
		double average = sum / n;
		
		int count = 0;
		for(int i = 0; i < numbers.length; i++) {
			if(numbers[i] > average) {
				count++;
			}
		}
		System.out.println("Average is " + average);
		System.out.println("Number of elements above the average is " + count);		
	}
}
