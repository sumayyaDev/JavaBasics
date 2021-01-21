import java.util.Arrays;
	
public class Student {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	public String name;
	  public String ID;
	  public String DOB;
	  public String address;
	  public String cgpa;
	  
	  Student()
	  {
	      this.name = "default name";
	      this.ID = "default id";
	      this.DOB = "default dob";
	      this.address = "default address";
	      this.cgpa = "default cgpa";
	  }
	  Student(String name, String ID)
	  {
	      this.name = name;
	      this.ID = ID;
	      this.DOB = "default DOB";
	      this.address = "default address";
	      this.cgpa = "default cgpa";
	  }
	  Student(String name, String ID, String DOB, String address, String cgpa)
	  {
	      this.name = name;
	      this.ID = ID;
	      this.DOB = DOB;
	      this.address = address;
	      this.cgpa = cgpa;
	  }
	  public void setAddress(String address)
	  {
	      this.address = address;
	  }
	  public String getname()   
	  {
	      return this.name;
	  }
	  public String getID()   
	  {
	      return this.ID;
	  }
	  public String getDOB()   
	  {
	      return this.DOB;
	  }
	  public String getAddres()   
	  {
	      return this.address;
	  }
	  public String getCGPA()   
	  {
	      return this.cgpa;
	  }
	  @Override
	  public String toString()
	  {
	      return "name: " + this.name +  " ID: " + this.ID + "\nDOB: " + this.DOB + " Address: " + this.address + "\nCGPA: " + this.cgpa;
	  }
}
