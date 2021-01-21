import java.util.Scanner;
public class ClassManagement {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
	
		// Making course object & courseList										
		String[] courseName = {"CSE", "HIS", "MAT", "EEE", "CHE"};
		int[] courseCode = {215, 102, 120, 154, 101};
		Course course = new Course(courseName, courseCode);
		String[] courseList = new String[courseName.length];
		System.out.print("courseList: ");
		for(int i = 0; i < courseName.length; i++) {
			courseList[i] = (courseName[i] + courseCode[i]);	// courseList
			System.out.print(courseList[i] + ", ");
		}
		System.out.println("\n");
		
		// Making faculty object
		String[] facultyName = {"Silvia Ahmed", "Ashfaque Hossain", "Showkat Ali", "Amity Kundu", "Tashfiya Ahmed"};
		int[] facultyID = {52, 63, 78, 44, 55};
		String[] facultyDOB = {"3/8/1990", "4/5/1985", "6/7/1984", "8/9/1986", "10/9/1987"};
		String[] facultyAddress = {"west road", "south road", "north road", "east road", "banani road"};
		String[] facultyDesignation = {"svA", "Aho", "swk", "akd1", "tfa"};
		Faculty faculty0 = new Faculty();            //HERE1
		Faculty faculty = new Faculty(facultyName, facultyID, facultyDOB, facultyAddress, facultyDesignation);
		String[] facultyArr = new String[facultyName.length];
		String[] fcArray = new String[facultyName.length];
		for(int i = 0; i < facultyName.length; i++) {
			facultyArr[i] = ("facultyName: " +facultyName[i] + ",\tID: " + facultyID[i] + ",\tDOB: " + facultyDOB[i] + ",\taddr: "+facultyAddress[i] + ",\tDesignation: " + facultyDesignation[i] + ",\tTeaching Course: " + courseList[i]);
			fcArray[i] = facultyName[i];              //fcArray
			System.out.println(facultyArr[i]);      
		}
		System.out.println();
		
		// Making student object
		String[] studentName = {"Sumayya", "Nowrin", "Sanjana", "Rubaiya", "Aithen", "Emran"};
		String[] takenCourse = {"CSE215, MAT120", "HIS102, CHE101", "CSE215", "EEE154", "CSE215, EEE154", "CHE101, MAT120"};
		int[] studentID = {2013, 2014, 2015, 1932, 1945, 1982};
		String[] studentDOB = {"12/29/2001", "11/30/2000", "10/25/1999", "8/16/2001", "7/23/1998", "4/17/1997"};
		String[] studentAddress = {"Dakshinkhan", "Uttara,sec-7", "Bashundhara", "Banani,sec-5", "Dhanmondi", "Farmgate"};
		double[] student_cgpa = {3.65, 3.25, 3.50, 3.15, 3.94, 3.85};
		Student student = new Student(studentName, studentID, studentDOB, studentAddress);
		String[] studentList = new String[studentName.length];
		System.out.println("Listed Students: ");
		for(int i = 0; i < studentName.length; i++) {
			studentList[i] = (studentName[i]+"\t>ID: "+studentID[i]+"\tDOB: "+studentDOB[i]+"\t  Address: "+studentAddress[i]+"\t  cgpa: "+student_cgpa[i] + "\tTaken Course: " + takenCourse[i]);
			System.out.println(studentList[i]);
		}
		System.out.print("\nHow many courses you want to enter now: ");
		int courseNum = input.nextInt();
		String[] inputCourseName = new String[courseNum];
		int[] inputCourseCode = new int[courseNum];
		String[] inputCourseList = new String[courseNum];
		for(int i = 0; i < courseNum; i++) {
			System.out.print("Enter courseName: ");
			inputCourseName[i] = input.next();
			System.out.print("Enter courseCode: ");
			inputCourseCode[i] = input.nextInt();
			inputCourseList[i] = (courseName[i] + courseCode[i]);   // CourseList
		}
		faculty0.setCourseList(inputCourseList);         //HERE2
		System.out.print("inputCourseList: ");
		for(int i = 0; i < courseNum; i++) {
			System.out.print(inputCourseList[i] + ", ");
		}
		System.out.println("\n");	
	}

}
