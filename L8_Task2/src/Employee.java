
public class Employee extends Person {
	
	public String office;
	public double salary;
	public MyDate dateHired;
	
	public Employee() {
		
	}
	public Employee(String name) {
		super(name);
	}
	public Employee(String name, String address, String phoneNumber, String emailAddress, String office, double salary, MyDate dateHired) {
		
		super(name, address, phoneNumber, emailAddress);
		this.office = office;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	public String getOffice() {
		return office;
	}
	public void setOffice(String office) {
		this.office = office;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public MyDate getDateHired() {
		return dateHired;
	}
	public void setDateHired(MyDate dateHired) {
		this.dateHired = dateHired;
	}
	
	
//	public String toString() {
//		return String.format("Class Name: " + this.getClass().getName() + "\tPerson Name: " + getName());
//	}
	
	public String toString() {
		return String.format("Class Name: " + this.getClass().getName() + "\tPerson�s name: " + getName() + "\n\t\t\tAddress: " + getAddress() + "\t   Phone Number: " + getPhoneNumber() + "\tEmailAddress: " + getEmailAddress() + "\n\t\t\tOffice: " + getOffice() + "\tSalary: " + getSalary() + "\tDateHired: " + getDateHired());
	}

}
