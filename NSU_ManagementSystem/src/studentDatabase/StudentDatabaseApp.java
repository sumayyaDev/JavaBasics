package studentDatabase;

import java.util.Scanner;

public class StudentDatabaseApp {

	public static void main(String[] args) {
	// Ask how many students we want to add
			Scanner input = new Scanner(System.in);
			System.out.print("Enter how many students you want to add: ");
			int numOfStudents = input.nextInt();
			Student[] students = new Student[numOfStudents];
			
			// Create specific number of new students
			for(int i = 0; i < numOfStudents; i++) {
				students[i] = new Student();
				students[i].enroll();
				students[i].payTution();
			}
			
			//Print student's all information
			for(int i = 0; i < numOfStudents; i++) {
				System.out.println("\n" + students[i].toString());
			}

	}

}
