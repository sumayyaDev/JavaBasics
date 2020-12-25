import java.util.Arrays;

public class fillArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {2, 4, 7, 10};
		int[] list2 = {2, 4, 7, 7, 7, 10};
		java.util.Arrays.fill(list1, 5);           // Fill 5 to the whole array              
		System.out.println(Arrays.toString(list1));
		
		java.util.Arrays.fill(list2, 2, 5, 8);     // 2 to (5-1) index will fill up by 8
		System.out.println(Arrays.toString(list2));
		
	}

}
