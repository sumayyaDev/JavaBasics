import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Scanner;
import java.awt.event.ActionEvent;

public class Student {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	/**
	 * Declaring Variable.
	 */
	private String firstName;
	private String lastName;
	private int gradeYear;
	String gradeLevel;
	private String studentID;
	private String courses = "";
	private int tuitionBalance;
	private static int costOfCourse = 19000;
	public static int id =1000;
	
	/**
	 * Calling constructor and taking input.
	 */
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
		
		/**
		 * Methods
		 */
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
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Student window = new Student();
					window.frame.setVisible(true);
					//Adding here
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
					//till here

					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
//	public Student() {
//		initialize();
//	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 871, 534);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("numOfStudent");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(28, 44, 127, 29);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBounds(161, 44, 167, 32);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			}
		});
		textField_1.setBounds(161, 96, 167, 29);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("lastName");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_1.setBounds(37, 133, 96, 41);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_2 = new JTextField();
		textField_2.setBounds(161, 140, 167, 32);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnNewButton_1 = new JButton("New button");
		btnNewButton_1.setBounds(37, 201, 85, 21);
		frame.getContentPane().add(btnNewButton_1);
		
		textField_3 = new JTextField();
		textField_3.setBounds(180, 202, 96, 19);
		frame.getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("firstName");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_2.setBounds(39, 94, 109, 29);
		frame.getContentPane().add(lblNewLabel_2);
	}

}
