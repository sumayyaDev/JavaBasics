import java.util.Scanner;
public class multiDimensionalArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int[][][] my3DArray = new int[3][5][2];
		
		for(int i = 0; i < my3DArray.length; i++) {
			for(int j = 0; j < my3DArray[i].length; j++) {
				for(int k = 0; k < my3DArray[i][j].length; k++) {
					
					my3DArray[i][j][k] = input.nextInt();
					}
			}
		}
		
		  for(int i = 0; i < my3DArray.length; i++) { 
			  for(int j = 0; j < my3DArray[i].length; j++) { 
				  for(int k = 0; k < my3DArray[i][j].length; k++) {
		  
		  System.out.printf(my3DArray[i][j][k] + " ");
		        } 
		      System.out.println();
		     }
		        System.out.println("---------------------------------------"); 
		  }
	}
}
