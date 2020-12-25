import java.util.Scanner;
public class PassingArraysToMethod {

	public static void main(String[] args) {	
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		System.out.println("Enter the element of the array:");
		for(int i = 0; i < array.length; i++) {
			array[i] = input.nextInt();
		}
		printArray(array);
		
	}
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++)
			System.out.printf("array[%d] = %d\n", i, array[i]);
	}
}
