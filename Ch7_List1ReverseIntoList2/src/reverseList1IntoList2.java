
public class reverseList1IntoList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list1 = {1, 2, 3, 4, 5, 6};
		int[] list2 = reverse(list1);
		for(int i = 0; i < list2.length; i++) {
			System.out.printf("list2[%d] = %d\n", i, list2[i]);
		}
		
	}
	public static int[] reverse(int[] list1) {
		int[] result = new int[list1.length];
		for(int i = 0, j = list1.length - 1; i < list1.length; i++, j--) {
			result[j] = list1[i];
		}
		return result;
	}
}
