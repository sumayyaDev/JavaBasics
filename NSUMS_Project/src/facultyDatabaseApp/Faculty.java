package facultyDatabaseApp;

import java.util.Scanner;

public class Faculty {
	private String firstName;
	private String lastName;
	public static int id = 100;
	private String facultyID;
	private String teachingCourses = "";
	private int salary;
	private int department;
	private String departmentName;
	
	//Scanner in = new Scanner(System.in);
	public Faculty() {
		Scanner in = new Scanner(System.in);
		System.out.print("\nEnter faculty's first Name: ");
		this.firstName = in.nextLine();
		System.out.print("Enter faculty's last Name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1-ECE\n2-Business\n3-Economics\n4-English\n5-PublicHealth\n6-Pharmacy\n7-Mathematics\nEnter department of the faculty: ");
		this.department = in.nextInt();
		if(department == 1) this.departmentName = "ECE";
		else if(department == 2) this.departmentName = "Business";
		else if(department == 3) this.departmentName = "Economics";
		else if(department == 4) this.departmentName = "English";
		else if(department == 5) this.departmentName = "PublicHealth";
		else if(department == 6) this.departmentName = "Pharmacy";
		else if(department == 7) this.departmentName = "Mathematics";
		else
			System.out.println("Invalid Input!");
		setFacultyID();
	}
	
	public void setFacultyID() {
		id++;
		this.facultyID = department + "" + id;
	}
	
	public void teachingCourses() {
		do {
			Scanner in = new Scanner(System.in);
			System.out.print("Enter faculty's teaching courses (Q to quit):");
			String course = in.nextLine();
			if(!course.equals("Q")) {
				this.teachingCourses = teachingCourses + "\n\t\t" + course;
			}
			else {
				break;
			}
		}while(1 != 0);
	}
	
	public int facultySalary() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter faculty's per month's salary:");
		this.salary = in.nextInt();
		return salary;
	}
	
	public String toString() {
		return "Faculty Name: " + firstName + " " + lastName +
				"\nDepartment: " + departmentName +
				"\nFacultyID: " + facultyID + 
				"\nSalary: " + salary +
				"\nTeaching Courses: " + teachingCourses;		
	}
}
