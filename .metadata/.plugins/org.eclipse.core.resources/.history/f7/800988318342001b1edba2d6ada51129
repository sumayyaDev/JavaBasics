import java.util.Scanner;
public class DisplayPyramid {			// Quiz1_Task3

	public static void main(String[] args) {
		// Write a program that prompts the user to enter an integer from 1 to 15 and displays a pyramid
		
		Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int line = input.nextInt();
        
        for(int i=1; i<=line; i++){
            
            for(int j = 1; j <= line-i; j++){
                System.out.print("  ");     //2 spaces
            }
            for(int k = i-1; k >= 0; k--){
                if(k==0) System.out.print((k+1) + " ");
                else System.out.print(3*k + " "); 
                
             }
            for(int m = 1; m <= (i-1); m++){
                System.out.print(3*m + " ");
            }
            System.out.println();
        }
	
	}

}
