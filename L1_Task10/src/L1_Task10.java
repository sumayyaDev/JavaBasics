
import java.util.Scanner;
public class L1_Task10 {

	public static void main(String[] args) {
		// Write a program that displays the following table. Cast floating point numbers into integers.
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of rows: ");
		int n = input.nextInt();
		
		System.out.println("a" + "    " + "b" + "    " + "pow(a,b)");
		for(int i=1; i<=n; i++) { 
			for(int j=i+1; j<=n+1; j++) {
				if (j==i+2) {
					break;
				}
				double iPowj = Math.pow(i, j);
				
				System.out.println(i + "    " + j + "    " + iPowj);
				
				input.close();
			}
		}

	}

}
