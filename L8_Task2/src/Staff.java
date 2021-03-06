
public class Staff extends Employee {
	
	public String title;
	
	public Staff() {
		
	}
	public Staff(String name, String address, String phoneNumber, String emailAddress,String office, double salary, MyDate dateHired, String title) {
		super(name, address, phoneNumber, emailAddress, office, salary, dateHired);
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
//	public String toString() {
//		return String.format("Class Name: " + this.getClass().getName() + "\tPerson Name: " + getName());
//	}
	
	public String toString() {
		return String.format("Class Name: " + this.getClass().getName() + "\tPerson�s name: " + getName() + "\n\t\t\tAddress: " + getAddress() + "\t   Phone Number: " + getPhoneNumber() + "\tEmailAddress: " + getEmailAddress() + "\n\t\t\tOffice: " + getOffice() + "\tSalary: " + getSalary() + "\tDateHired: " + getDateHired() + "\tTitle: " + getTitle());
	}

}
