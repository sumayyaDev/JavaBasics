import java.lang.System;
public class CopyingArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] sourceArray = {2, 3, 1, 5, 10};
		int[] targetArray = new int[sourceArray.length];
		
		/*
		 * System.out.print("The target array is: "); for(int i = 0; i <
		 * sourceArray.length; i++) { targetArray[i] = sourceArray[i];
		 * System.out.print(targetArray[i] + " "); }
		 */
		System.arraycopy(sourceArray, 0, targetArray, 0, sourceArray.length);
		System.out.print("The target array is: ");
		for(int i = 0; i < sourceArray.length; i++) {
			System.out.print(targetArray[i] + " ");
		}
	}

}
