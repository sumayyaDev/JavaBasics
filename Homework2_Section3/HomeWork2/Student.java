import java.util.Arrays;
	
public class Student {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	private String[] name;
	private int[] ID;
	private String[] dob;
	private String[] address;
	private double[] cgpa;
	
	public Student() {
		super();
	}

	public Student(String[] name, int[] iD) {
		super();
		this.name = name;
		ID = iD;
	}

	public Student(String[] name, int[] iD, String[] dob, String[] address) {
		super();
		this.name = name;
		ID = iD;
		this.dob = dob;
		this.address = address;
	}

	public void setAddress(String[] address) {
		this.address = address;
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

	public double[] getCgpa() {
		return cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + Arrays.toString(name) + ", ID=" + Arrays.toString(ID) + ", dob="
				+ Arrays.toString(dob) + ", address=" + Arrays.toString(address) + ", cgpa=" + Arrays.toString(cgpa)
				+ "]";
	}

}
