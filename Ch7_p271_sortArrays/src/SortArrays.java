import java.util.Arrays;
public class SortArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double[] numbers = {6.0, 4.4, 1.9, 2.9, 3.4, 3.5};
		Arrays.sort(numbers);
		System.out.print("Sorted numbers[]: ");
		System.out.println(Arrays.toString(numbers));
		
		double[] numbers2 = {9, 6, 33, 21, -7, 5, -43, 66, 13, 10};
		Arrays.parallelSort(numbers2);
		System.out.printf("Sorted numbers2[]: %s", Arrays.toString(numbers2));
	}

}
