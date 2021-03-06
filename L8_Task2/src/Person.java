
public class Person {
	
	public String name;
	public String address;
	public String phoneNumber;
	public String emailAddress;
	
	public Person() {
		
	}
	public Person(String name) {
		this.name = name;
	}
	public Person(String name, String address, String phoneNumber, String emailAddress) {
		this.name = name;
		this.address = address;
		this.phoneNumber =	phoneNumber;
		this.emailAddress = emailAddress;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
//	public String toString() {
//		return String.format("Class Name: " + this.getClass().getName() + "\tPerson Name: " + getName());
//	}
	
	public String toString() {
		return String.format("Class Name: " + this.getClass().getName() + "\tPerson�s name: " + getName() + "\n\t\t\tAddress: " + getAddress() + "\t   Phone Number: " + getPhoneNumber() + "\tEmailAddress: " + getEmailAddress());
	}
	
	
	
	
	

}
