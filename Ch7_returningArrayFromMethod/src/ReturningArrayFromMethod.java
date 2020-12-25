import java.util.Scanner;
public class ReturningArrayFromMethod {

	public static void main(String[] args) {
		// Pass an array to a method & the method returns an array that is the reversal of another array
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		int[] list = new int[size];
		System.out.println("Enter the element of the original array:");
		for(int i = 0; i < list.length; i++) {
			list[i] = input.nextInt();
		}
		int[] result = reverse(list);
		System.out.println("The reverse array is:");
		for(int i = 0; i < result.length; i ++) {
			System.out.printf("reverse[%d] = %d\n", i, result[i]);
		}

	}
	public static int[] reverse(int[] list) {
		int[] result = new int[list.length];
		
		for(int i = 0, j = list.length - 1; i < list.length; i++, j--) {
			result[j] = list[i];
		}
		return result;
	}

}
