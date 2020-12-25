
public class TestPassArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1, 2};
		// Swap elements using the swap method
		System.out.println("Before invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
		swapFirstTwoInArray(a);
		System.out.println("After invoking swap");
		System.out.println("array is {" + a[0] + ", " + a[1] + "}");
	}
	public static void swapFirstTwoInArray(int [] array) {
		int temp = array[0];
		array[0] = array[1];
		array[1] = temp;
	}
}
