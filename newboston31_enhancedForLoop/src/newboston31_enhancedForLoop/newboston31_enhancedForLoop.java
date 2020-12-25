package newboston31_enhancedForLoop;

public class newboston31_enhancedForLoop {

	public static void main(String[] args) {
		// Find out the total of the elements of the array
		int[] sumu = {3, 4, 5, 6, 7, 8};
		
		int total = 0;
		for(int x: sumu) {
			total += x;
		}
		System.out.println(total);
	}

}
