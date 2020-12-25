
public class L4_Task1 {

	public static void main(String[] args) {
		// Write a test program that uses this method to display the first 100 pentagonal numbers with 10 numbers on each line.
		System.out.println("The first 100 pentagonal number are: ");
		for(int n=1; n<=100; n++) {
			System.out.printf("%6d", getPentagonalNumber(n));
			if(n % 10 == 0)
				System.out.println();
			
		}
	}
	public static int getPentagonalNumber(int n) {
		// A pentagonal number is defined as n(3n–1)/2 
		return (n*(3*n - 1)) / 2;
	}

}
