import java.util.Scanner;
public class CountOccurrenceOfNumbers {

	public static void main(String[] args) {
		// Write a program that reads the integers between 1 and 100 and counts the occurrences of each. Assume the input ends with 0.
		Scanner input = new Scanner(System.in);
		int[] numbers = new int[100];
		int value;
		System.out.print("Enter the integers between 1 and 100: ");
		int i = 0;
		do {
			value = input.nextInt();
			numbers[i] = value;
			i++;
		}while(value != 0);
		
		countOccurrence(numbers);
	}
	public static void countOccurrence(int[] numbers) {
		
		for(int i = 1; i <= 100; i++) {
			int count = 0;
			for(int j = 0; j < numbers.length - 1; j++) {
				if(numbers[j] == i) 
				count++;
			}
			
			if(count != 0)
				System.out.printf("%d occurs %d %s\n", i, count, count > 1 ? "times" : "time");		
		}
	}

}
