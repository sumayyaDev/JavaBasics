import java.util.Scanner;
public class ClassManagement {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		//System.out.println("Input course name & course code: ");
		Course course = new Course();
		String[] courseName = {"CSE", "HIS", "MAT", "EEE", "CHE"};
		int[] courseCode = {215, 102, 120, 154, 101};
		course.setName(courseName);
		course.setCode(courseCode);
		String[] courseList = new String[courseName.length];
		System.out.print("courseList: ");
		for(int i = 0; i < courseName.length; i++) {
			courseList[i] = (courseName[i] + courseCode[i]);
			System.out.print(courseList[i] + ", ");
		}
		System.out.println("\n");
		
		Faculty faculty = new Faculty();
		String[] facultyName = {"Silvia Ahmed", "Ashfaque Hossain", "Showkat Ali", "Amity Kundu", "Tashfiya Ahmed"};
		int[] facultyID = {52, 63, 78, 44, 55};
		String[] facultyDOB = {"3/8/1990", "4/5/1985", "6/7/1984", "8/9/1986", "10/9/1987"};
		String[] facultyAddress = {"west road", "south road", "north road", "east road", "banani road"};
		String[] facultyDesignation = {"svA", "Aho", "swk", "akd1", "tfa"};
		faculty.setName(facultyName);
		faculty.setID(facultyID);
		faculty.setDateOfBirth(facultyDOB);
		faculty.setAddress(facultyAddress);
		faculty.setDesignation(facultyDesignation);
		faculty.setCourseList(courseList);
		for(int i = 0; i < facultyName.length; i++) {
			System.out.println("facultyName: " +facultyName[i] + ",\tID: " + facultyID[i] + ",\tDOB: " + facultyDOB[i] + ",\taddr: "+facultyAddress[i] + ",\tDesignation: " + facultyDesignation[i] + ",\tTeaching Course: " + courseList[i]);
		}
		System.out.println();
		
		Student student = new Student();
		String[] studentName = {"Sumayya", "Nowrin", "Sanjana", "Rubaiya", "Aithen", "Emran"};
		String[] takenCourse = {"CSE215, MAT120", "HIS102, CHE101", "CSE215", "EEE154", "CSE215, EEE154", "CHE101, MAT120"};
		int[] studentID = {2013, 2014, 2015, 1932, 1945, 1982};
		String[] studentDOB = {"12/29/2001", "11/30/2000", "10/25/1999", "8/16/2001", "7/23/1998", "4/17/1997"};
		String[] studentAddress = {"Dakshinkhan", "Uttara,sec-7", "Bashundhara", "Banani,sec-5", "Dhanmondi", "Farmgate"};
		double[] student_cgpa = {3.65, 3.25, 3.50, 3.15, 3.94, 3.85};
		student.setName(studentName);
		student.setID(studentID);
		student.setDateOfBirth(studentDOB);
		student.setAddress(studentAddress);
		student.setCgpa(student_cgpa);
		System.out.println("Listed Students: ");
		for(int i = 0; i < studentName.length; i++) {
			System.out.println(studentName[i]+"\t>ID: "+studentID[i]+"\tDOB: "+studentDOB[i]+"\t  Address: "+studentAddress[i]+"\t  cgpa: "+student_cgpa[i] + "\tTaken Course: " + takenCourse[i]);
		}
		
	}

}
