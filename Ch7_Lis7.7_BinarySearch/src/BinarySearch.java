import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
		System.out.print("Enter the key number that want to search it's index: ");
		int key = input.nextInt();
		System.out.println(key + " is found at index " + binarySearch(list, key));
	}
	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		
		while(high >= low) {
			int mid = (low + high) / 2;
			if(key < list[mid])
				high = mid-1;
			else if(key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return - low- 1;  // Now high less then low, key not found
	}

}
