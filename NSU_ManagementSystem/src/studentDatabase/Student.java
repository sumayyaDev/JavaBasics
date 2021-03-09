package studentDatabase;

import java.util.Scanner;
import java.util.*;
import java.io.*;

public class Student {
	private String firstName;
	private String lastName;
	private int gradeYear;
	String gradeLevel;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 19000;
	public static int id =1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter student's first name: ");
		this.firstName = input.nextLine();
		
		System.out.print("Enter student's last name: ");
		this.lastName = input.nextLine();
		
		System.out.print("1-Freshmen\n2-Sophomore\n3-Junior\n4-Senior\nEnter student's class level(1,2,3 or 4): ");
		this.gradeYear = input.nextInt();
		setstudentID();
		if(gradeYear == 1)  this.gradeLevel = "Freshmen";
		else if(gradeYear == 2)  this.gradeLevel = "Sophomore";
		else if(gradeYear == 3)  this.gradeLevel = "Junior";
		else if(gradeYear == 4)  this.gradeLevel = "Senior";
		else
			System.out.println("Invalid input!(Input should be from 1 to 4");	
	}
	
	
	// Generate an ID
	public void setstudentID() {
		//gradeLavel + id
		id++;
		this.studentID = gradeYear + "" + id;
	}
	
	
	// Enroll in courses
	public void enroll() {
		do {
			System.out.print("Enter courses to enroll (Q to quit): ");
			Scanner input = new Scanner(System.in);
			String course = input.nextLine();
			if(!course.equals("Q")) {
				courses = courses + "\n\t\t" + course;
				tuitionBalance = tuitionBalance + costOfCourse;
			}
			else {
				break;
			}
		}while(1 != 0);
	}
	
	
	// View balance
	public void viewBalance() {
		System.out.println("Your balance is Tk/= " + tuitionBalance);
	}
	// Pay tuition
	public int payTution() {
		viewBalance();
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your payment: ");
		int payment = input.nextInt(); 
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of Tk/= " + payment);
		viewBalance();
		return tuitionBalance;
	}
	
	
	// Show status
	public String toString() {
		return "\nStudent Name: " + firstName + " " + lastName +
				"\nGrade lavel: " + gradeLevel +
				"\nStudent ID: " + studentID +
				"\nCourses enrolled: " + courses + 
				"\nBalance: Tk/= " + tuitionBalance;
	}
	
	
}
