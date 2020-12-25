
public class Course {
	private String courseName;
	private String[] students = new String[100];
	private int numberOfStudents = 0;
	
	
	public Course(String courseName) {  // Create a course with the specified name
		this.courseName = courseName;
	}
	public String getCourseName() {    // Returns the course name
		return courseName;
	}
	public void addStudent(String theStudent) {   // Adds a new student to the course
		students[numberOfStudents] = theStudent;
		numberOfStudents++; // Upadate the total number of students
	}
	public String[] getStudents() {   // Get all the students name from the student's array
		return students;
	}
	public int getNumberOfStudents() { // Get the number of total studens
		return numberOfStudents;
	}
	public void dropStudent(int dropStdNum) {
		this.numberOfStudents = numberOfStudents - dropStdNum;
	}
}
