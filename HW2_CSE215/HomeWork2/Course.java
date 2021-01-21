import java.util.Arrays;

public class Course {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	private String[] name;
	private int[] code;
	private String[] studentList;
	private String[] faculty;
	
	public Course() {
		super();
	}

	public Course(String[] name, int[] code) {
		super();
		this.name = name;
		this.code = code;
	}

	public Course(String[] name, int[] code, String[] studentList, String[] faculty) {
		super();
		this.name = name;
		this.code = code;
		this.studentList = studentList;
		this.faculty = faculty;
	}

	public void setStudentList(String[] studentList) {
		this.studentList = studentList;
	}

	public void setFaculty(String[] faculty) {
		this.faculty = faculty;
	}

	public String[] getName() {
		return name;
	}

	public int[] getCode() {
		return code;
	}

	public String[] getStudentList() {
		return studentList;
	}

	public String[] getFaculty() {
		return faculty;
	}

	@Override
	public String toString() {
		return "Course [name=" + Arrays.toString(name) + ", code=" + Arrays.toString(code) + ", studentList="
				+ Arrays.toString(studentList) + ", faculty=" + Arrays.toString(faculty) + "]";
	}
}
