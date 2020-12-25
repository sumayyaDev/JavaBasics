import java.util.Scanner;
public class GreatestCommonDivisorMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		// Prompt the user to enter two integer
		System.out.print("Enter first integer: ");
		int n1 = input.nextInt();
		System.out.print("Enter second integer: ");
		int n2 = input.nextInt();
		
		System.out.println("The greatest common divisor for " + n1 + " and " + n2 + " is " + gcd(n1, n2));
	}
	public static int gcd(int n1, int n2) {
		int gcd = 1; // Initial gcd is 1 
		int k =  2;  // Possible gcd
		
		while(k <= n1 && k <= n2) {
			if(n1 % k == 0 && n2 % k == 0) {
				gcd = k;
			}
			k++;
		} 
		return gcd;
	}

}
