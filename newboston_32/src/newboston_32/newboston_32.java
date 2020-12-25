package newboston_32;

public class newboston_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int array[] = {3, 4, 5, 6, 7, 9};
		
		changeArray(array);
		for(int y: array) {
			System.out.print(y + " ");
		}
		
	}
	public static void changeArray(int x[]) {
		for(int counter = 0; counter < x.length; counter++) {
			x[counter] += 5;
		}
	}

}
