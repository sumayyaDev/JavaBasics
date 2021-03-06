
public class Faculty extends Employee{
	
	public static final String LECTURER = "Lecturer";
	public static final String ASSISTANT_PROFESSOR = "Assistant Professor";
	public static final String ASSOCIATE_PROFESSOR = "Associate Professor";
	public static final String PROFESSOR = "Professor";
	
	private String officeHours;
	private String rank;
	
	public Faculty() {
		
	}
	public Faculty(String name, String address, String phoneNumber, String emailAddress,String office, double salary, MyDate dateHired, String officeHours, String rank) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.officeHours = officeHours;
		this.rank = rank;
	}
	
	
	public String getOfficeHours() {
		return officeHours;
	}
	public void setOfficeHours(String officeHours) {
		this.officeHours = officeHours;
	} 
	public String getRank() {
		return rank;
	}
	public void setRank(String rank) {
		this.rank = rank;
	} 
	
	
//	public String toString() {
//		return String.format("Class Name: " + this.getClass().getName() + "\tPerson Name: " + getName());
//	}
	
	public String toString() {
		return String.format("Class Name: " + this.getClass().getName() + "\tPerson�s name: " + getName() + "\n\t\t\tAddress: " + getAddress() + "\t   Phone Number: " + getPhoneNumber() + "\tEmailAddress: " + getEmailAddress() + "\n\t\t\tOffice: " + getOffice() + "\tSalary: " + getSalary() + "\tDateHired: " + getDateHired() + "\tOfficeHours: " + getOfficeHours() + "\tRank: " + getRank());
	}
	
}
