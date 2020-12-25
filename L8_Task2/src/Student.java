
public class Student extends Person {
	
	public static final String FRESHMAN = "freshman";
	public static final String SOPHOMORE = "sophomore";
	public static final String JUNIOR = "junior";
	public static final String SENIOR = "senior";
	
	public String status;
	
	public Student() {
		
	}
	public Student(String name, String address, String phoneNumber, String emailAddress, String status) {
		super(name, address, phoneNumber, emailAddress);
		this.status = status;
	}
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
//	public String toString() {
//		return String.format("Class Name: " + this.getClass().getName() + "\tPerson Name: " + getName());
//	}
	
	public String toString() {
		return String.format("Class Name: " + this.getClass().getName() + "\tPerson’s name: " + getName() + "\n\t\t\tAddress: " + getAddress() + "\t   Phone Number: " + getPhoneNumber() + "\tEmailAddress: " + getEmailAddress() + "\n\t\t\tStatus: " + getStatus());
	}

}
