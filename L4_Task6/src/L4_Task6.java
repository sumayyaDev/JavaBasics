
import java.util.Scanner;
public class L4_Task6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter n: ");
		int n = input.nextInt();
		printMatrix(n);
	}
	public static void printMatrix(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print((int) (Math.random() * 2) + " ");				
			}
			System.out.println();
		}
	}

}
