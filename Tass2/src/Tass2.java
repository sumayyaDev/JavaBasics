import java.util.*;
public class Tass2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean[][] array = new boolean[2][2];
		// Get the array
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				array[i][j] = input.nextBoolean();
			}
		}
		// Print the table
		int count = 0;
		int flag = 0;
		String array2[]= new String[4];
		for(int i=0; i<4; i++)
		{
			array2[i] = "-1";
		}
		for(int i = 0; i < 2; i++) {
			for(int j = 0; j < 2; j++) {
				if(array[i][j] == true && i!=j) {
					//System.out.print("\tfriends");
					count++;
					String val = String.valueOf(i) + String.valueOf(j);
					System.out.print(val + " ");
					array2[flag] = val;
					flag++;
				}
			}
		}
//		for(int i = 0; i<4; i++)
//		{
//			System.out.print(array2[i]);
//		}
//		
//				int pair = 0;
//				for(int k = 0; k <4; k++) {
//					
//					for(int l = k+1; l<4; l++)
//					{
//						String reverse = "";
//						int length = array2[l].length();
//						for(int i=length-1; i>0; i--)
//						{
//							reverse = reverse + array2[l].charAt(i);
//						}	
//					
//					if(array2[k]!=reverse)
//					{
//						pair++;
//						array2[l] = "-1";
//						
//					}
//					}
//						
//				}
 	System.out.print("Count: " + count);
				
	}
}
				








