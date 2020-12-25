import java.util.Scanner;
public class shiftingElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		//System.out.print("Enter the size of the array: ");
		//int size = input.nextInt();
		double[] myList = {6, 2, 14, 67, 9};
		
		double temp = myList[0];  // Retain the first element
		// Shift elements left
		for(int i = 1; i < myList.length; i++) {
			myList[i - 1] = myList[i];
		}
		// Move the first element to fill in the last position
		myList[myList.length - 1] = temp;
		
		for(int i = 0; i < myList.length; i++) {
			System.out.print(myList[i] + "  ");
	}
  }
}
