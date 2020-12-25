import java.util.Scanner;
public class TestCourse {

	public static void main(String[] args) {
		/* Write a test program that
		 * creates a course,
		 * adds three students,
		 * removes one and
		 * display the students in the course
		 */
		Scanner input = new Scanner(System.in);
		Course course1 = new Course("Data Structures");
		Course course2 = new Course("Database System");
		
		course1.addStudent("Sumayya Akter");
		course1.addStudent("Nowrin Islam");
		course1.addStudent("Asfariya Chowdhury");
		
		System.out.println("Number of students in " + course1.getCourseName() + "(course1): " + course1.getNumberOfStudents());
		
		String[] students = course1.getStudents();
		for(int i = 0; i < course1.getNumberOfStudents(); i++) {
			System.out.print(students[i] + ", ");
		}
		System.out.println();
		
		course2.addStudent("Jafar Sadik");
		course2.addStudent("Farseem Islam");
		
		System.out.println("Number of students in " + course2.getCourseName() + "(course2): " + course2.getNumberOfStudents());
		
		String[] student = course2.getStudents();
		for(int i = 0; i < course2.getNumberOfStudents(); i++) {
			System.out.print(student[i] + ", ");
		}
		System.out.println();
		System.out.print("How many students are dropping: ");
		int dropStdNum = input.nextInt();
		System.out.print("Dropping students from the course1 is " );
		String dropName = input.next();
		course1.dropStudent(dropStdNum);
		System.out.println("Total number of students in course1 is now: " + course1.getNumberOfStudents());
		
		
					
	}
	
}
