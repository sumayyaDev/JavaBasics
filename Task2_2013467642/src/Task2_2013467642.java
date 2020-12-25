import java.util.Scanner;
public class Task2_2013467642 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		boolean[][] array = new boolean[5][5];
		// Get the array
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				array[i][j] = input.nextBoolean();
			}
		}
		// Print the table
		System.out.println("| 0 | 1 | 2 | 3 | 4 |");
		System.out.println("|---|---|---|---|---|");
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == true) {
					System.out.print("| * ");
				}
				else
					System.out.print("|   ");
			}
			System.out.println("|" + i );
			System.out.println("|---|---|---|---|---|");
			
		}
		countPairOfFriends(array);
	}
	public static void countPairOfFriends(boolean[][] array) {
		int count = 0;
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				if(array[i][j] == true && i != j)
					count++;
			}
		}
		System.out.println("\nThe pair of friends is " + (count-1));
	}
	
}
				