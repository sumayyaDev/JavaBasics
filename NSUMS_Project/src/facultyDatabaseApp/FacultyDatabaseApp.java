package facultyDatabaseApp;

import java.util.Scanner;

public class FacultyDatabaseApp {

	public static void main(String[] args) {
		//Ask how many faculty's have to add
		Scanner in = new Scanner(System.in);
		System.out.print("Enter how many Faculty you want to add: ");
		int numOfFaculty = in.nextInt();
		
		Faculty[] faculty = new Faculty[numOfFaculty];
		//Create specific number of faculty
		for(int i = 0; i < numOfFaculty; i++) {
			faculty[i] = new Faculty();
			faculty[i].teachingCourses();
			faculty[i].facultySalary();
		}
		
		for(int i = 0; i < numOfFaculty; i++) {
			System.out.println("\n" + faculty[i].toString());
		}
	}

}
