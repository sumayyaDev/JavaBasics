package newboston_34;

public class newboston_34 {

	public static void main(String[] args) {
		// Multi-dimensional array
		int firstArray[][]= {{12, 43, 76, 54}, {58, 45, 98, 78}};
		int secondArray[][] = {{45, 96, 58, 97}, {99}, {98, 65, 24}};
		
		System.out.println("This is the first array: ");
		display(firstArray);
		System.out.println("This is the second array: ");
		display(secondArray);
	}
	public static void display(int[][] array) {
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + "  ");
			}
			System.out.println();
		}
	}

}
