package offeredCourseListApp;

import java.util.Scanner;

public class OfferedCourseList {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		OfferdCourse cor = new OfferdCourse();
		
		System.out.print("\nEnter how many courses you want to take: ");
		int numOfCourse = in.nextInt();
		
		String[] array = new String[numOfCourse];
		System.out.println("Enter the name of your chosen courses:");
		for(int i = 0; i < numOfCourse; i++) {
			Scanner input = new Scanner(System.in);
			array[i] = input.nextLine();	
		}
		OfferdCourse courseObj = new OfferdCourse(array);

	}

}
