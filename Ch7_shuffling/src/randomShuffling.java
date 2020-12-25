import java.util.Scanner;
public class randomShuffling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the size of the array: ");
		int size = input.nextInt();
		double[] myList = new double[size];
		for(int i = 0; i < myList.length; i++) {
			myList[i] = input.nextDouble();
		} 
		for(int i = 0; i < myList.length; i++) {
			System.out.printf("myList[%d] = %.2f\n", i, myList[i]);
		}
		// Generate an index j randomly
		for(int i = myList.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));
			
			// Swap myList[i] with myList[j]
			double temp = myList[i];
			myList[i] = myList[j];
			myList[j] = myList[i];
			System.out.printf("myList[%d] = %.2f\n", j, myList[j]);
		}
		
	}

}
