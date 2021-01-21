import java.util.Arrays;

public class Faculty {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
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

	public Faculty(String[] name, int[] iD, String[] dob, String[] address, String[] designation) {
		super();
		this.name = name;
		ID = iD;
		this.dob = dob;
		this.address = address;
		this.designation = designation;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	public void setCourseList(String[] courseList) {
		this.courseList = courseList;
	}

	public String[] getName() {
		return name;
	}

	public int[] getID() {
		return ID;
	}

	public String[] getDob() {
		return dob;
	}

	public String[] getAddress() {
		return address;
	}

	public String[] getDesignation() {
		return designation;
	}

	public String[] getCourseList() {
		return courseList;
	}

	@Override
	public String toString() {
		return "Faculty [name=" + Arrays.toString(name) + ", ID=" + Arrays.toString(ID) + ", dob="
				+ Arrays.toString(dob) + ", address=" + Arrays.toString(address) + ", designation="
				+ Arrays.toString(designation) + ", courseList=" + Arrays.toString(courseList) + "]";
	}
}
