import java.util.Scanner;

public class test2D {
 public static void main(String[] args)
 {
	 Scanner inp = new Scanner(System.in);
	 int twoD[][] =new int [3][];
	 for(int i=0; i<3; i++)
	 {
		 int var;
		 
		 for(int j=0; j<5; j++)
		 {
			 
			 var = inp.nextInt();
			 twoD[i][j] = var;
		 }
	 }
			 
 }
}
