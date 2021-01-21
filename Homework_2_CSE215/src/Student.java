import java.util.Arrays;
import java.util.Date;

public class Student {
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

	public Student(String[] name, int[] iD, String[] dateOfBirth, String[] address) {
		super();
		this.name = name;
		ID = iD;
		this.dob = dateOfBirth;
		this.address = address;
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

	public double[] getCgpa() {
		return cgpa;
	}

	public void setCgpa(double[] cgpa) {
		this.cgpa = cgpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + Arrays.toString(name) + ", ID=" + Arrays.toString(ID) + ", dateOfBirth="
				+ Arrays.toString(dob) + ", address=" + Arrays.toString(address) + ", cgpa="
				+ Arrays.toString(cgpa) + "]";
	}
}
