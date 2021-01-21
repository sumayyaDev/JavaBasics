import java.util.Scanner;
public class RandomArrayUsingArrayList {

	public static void main(String[] args) {
		/* (Largest rows and columns) Write a program that randomly fills in 0s and 1s into an n-by-n matrix,
		 * prints the matrix, and finds the rows and columns with the most 1s. 
		 * (Hint: Use two ArrayLists to store the row and column indices with the most 1s.)
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the array size n: ");
		int n = input.nextInt();
		int[][] array = new int[n][n];
		
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				array[i][j] = (int)(Math.random()*2);
			}
		}
		System.out.println("The random array is ");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		
		ArrayList<Integer> row = new ArrayList<>();
		ArrayList<Integer> col = new ArrayList<>();
		
		
//		System.out.println("The largest row index: " + largestRowIndex(array));
//		System.out.println("The largest column index: " + largestColumnIndex(array));
	}
	

}
