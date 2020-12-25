import java.util.Scanner;
public class LinearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[] list = {1, 4, 4, 2, 5, -3, 6 , 2};
		System.out.print("Enter the key number that you want to search: ");
		int key = input.nextInt();
		System.out.println(key + " is found at index " + linearSearch(list, key));
	}
	public static int linearSearch(int[] list, int key) {
		for(int i = 0; i < list.length; i++) {
			if(key == list[i])
				return i;
		}
		return -1;
	}

}
