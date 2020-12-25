import java.lang.System;
public class checkPointArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] source = {3, 4, 5};
		int[] t = new int[source.length];
		
		System.arraycopy(source, 0, t, 0, source.length);
		System.out.print("The target array t is: ");
		for(int i = 0; i < source.length; i++) {
			System.out.print(t[i] + ", ");
		}
		// Does the following code resize the array
		int[] myList;
		myList = new int[10];
		myList = new int[20];
		System.out.print("\n" + myList.length);
	}

}
