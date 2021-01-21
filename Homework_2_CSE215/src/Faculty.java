import java.util.Arrays;
import java.util.Date;

public class Faculty {
	private String[] name;
	private int[] ID;
	private String[] dob;
	private String[] address;
	private String[] designation;
	private String[] courseList;
	
	public Faculty() {
		super();
	}

	public Faculty(String[] name, int[] iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public Faculty(String[] name, int[] iD, String[] dateOfBirth, String[] address, String[] designation) {
		super();
		this.name = name;
		ID = iD;
		this.dob = dateOfBirth;
		this.address = address;
		this.designation = designation;
	}

	public String[] getName() {
		return name;
	}

	public void setName(String[] name) {
		this.name = name;
	}

	public int[] getID() {
		return ID;
	}

	public void setID(int[] iD) {
		ID = iD;
	}

	public String[] getDateOfBirth() {
		return dob;
	}

	public void setDateOfBirth(String[] dateOfBirth) {
		this.dob = dateOfBirth;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	public String[] getDesignation() {
		return designation;
	}

	public void setDesignation(String[] designation) {
		this.designation = designation;
	}
	
	
	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}

	public String[] getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {   // You may cancel the course list
		return "Faculty [name=" + Arrays.toString(name) + ", ID=" + Arrays.toString(ID) + ", dateOfBirth="
				+ Arrays.toString(dob) + ", address=" + Arrays.toString(address) + ", designation="
				+ Arrays.toString(designation) + ", courseList=" + Arrays.toString(courseList) + "]";
	}
}
