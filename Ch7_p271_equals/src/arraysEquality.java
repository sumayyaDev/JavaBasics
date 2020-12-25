
public class arraysEquality {

	public static void main(String[] args) {
		// Check whether two arrays are strictly equal or not
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 10};
		int[] list3 = {4, 2, 7, 10};
		System.out.println(java.util.Arrays.equals(list1, list2));
		System.out.println(java.util.Arrays.equals(list2, list3));

	}

}
