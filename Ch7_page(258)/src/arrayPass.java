import java.util.Scanner;
public class arrayPass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 1;
		int[] y = new int[10];
		System.out.println("Enter the elements of the array:");		
		for(int i = 0; i < y.length; i++) {
			y[i] = input.nextInt();
		}
		for(int i = 0; i < y.length; i++) {
			System.out.printf("y[%d] = %d\n", i, y[i]);
		}
		m(x, y);
		
		System.out.println("x is " + x);
		System.out.println("y[0] is " + y[0]);
	}
	public static void m(int number, int[] numbers) {
		number = 1001;
		numbers[0] = 5555;
	}

}
