
public class showOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {2, 4, 7, 10};
		java.util.Arrays.fill(list1, 7);
		System.out.println(java.util.Arrays.toString(list1));
		
		int[] list2 = {2, 4, 7, 10};
		System.out.println(java.util.Arrays.toString(list2));
		System.out.println(java.util.Arrays.equals(list1, list2));

		
	}

}
