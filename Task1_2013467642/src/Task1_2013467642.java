import java.util.Scanner;
public class Task1_2013467642 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int num = input.nextInt();
		System.out.print("Enter the number of weeks: ");
		int week = input.nextInt();
		int[][] student = new int[num][week];
		int[] sum = new int[num];
		
		// Get the array value
		for(int i = 0; i < num; i++) {
			int total = 0;
			for(int j = 0; j < week; j++) {
				student[i][j] = input.nextInt();
				total += student[i][j];
			}
			sum[i] = total;
		}
		
		// Print the array
		for(int i = 0; i < num; i++) {
			for(int j = 0; j < week; j++) {
				System.out.print(student[i][j] + "  ");
			}
			System.out.println("total of student " + i +" = " + sum[i]);
		}
		int classTotal = calculateClassTotal(sum);
		System.out.println("\nClass Total: " + classTotal);
		double average = calculateAverage(classTotal, num);
		System.out.println("Class Average: " + average);

	}
	
	  // Get class total of all the students
	  public static int calculateClassTotal(int[] sum) {
		  int classTotal = 0;
		  for(int i = 0; i < sum.length; i++) {
			  classTotal += sum[i];
		  }
		  return classTotal;
    }
	  // Get average
	  public static double calculateAverage(int classTotal, int num) {
		  double average = (double)classTotal / num;
		  
		  return average;
	  } 
}
