package ttt;
import java.util.*;
public class friends {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input = new Scanner(System.in);
		
		boolean[] []arr = new boolean[5][5];
		// Get the array
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				arr[i][j] = input.nextBoolean();
			}
		}
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				if(arr[i][j] == true) {
					System.out.print(" * ");
				}
				else
					System.out.print("   ");
	      }
			System.out.println();
		}

     }
}
