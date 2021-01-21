import java.util.Arrays;
import java.util.ArrayList;

public class Faculty {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	public String name;
	  public String ID;
	  public String DOB;
	  public String address;
	  public String designation;
	  public ArrayList<Course> courses = new ArrayList<Course>();
	  
	  Faculty()
	  {
	      this.name = "default name";
	      this.ID = "default ID";
	      this.DOB = "default DOB";
	      this.address = "default address";
	      this.designation = "default designation";
	  }
	  Faculty(String name, String ID)
	  {
	      this.name = name;
	      this.ID = ID;
	      this.DOB = "default DOB";
	      this.address = "default address";
	      this.designation = "default designation";
	  }
	  
	  Faculty(String name, String ID, String DOB, String address, String designation)
	  {
	      this.name = name;
	      this.ID = ID;
	      this.DOB = DOB;
	      this.address = address;
	      this.designation = designation;
	      
	  }
	  
	  public void setAddress(String address)
	  {
	      this.address = address;
	  }
	  public void addCourses(Course course)
	  {
	      courses.add(course);
	  }
	  public String getName()
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
	  public String getAddress()
	  {
	      return this.address;
	  }
	  public String getDesignation()
	  {
	      return this.designation;
	  }
	  public ArrayList<Course> getCourses()
	  {
	      return this.courses;
	  }
	 
	  @Override
	  public String toString()
	  {
	      return "[Faculty Class]\n" + "name: " + this.name + " ID:" + this.ID + "\nDOB: " + this.DOB + " Address: " + this.address + "\nDesignation: " + this.designation + "\nCourses: " + this.courses;
	      
	  }
}
