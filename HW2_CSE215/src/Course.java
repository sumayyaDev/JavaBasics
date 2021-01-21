import java.util.Arrays;
import java.util.ArrayList;

public class Course {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	public String name;
	   public String code;
	   public ArrayList<Student> students = new ArrayList<Student>();
	   public Faculty faculty;
	   
	   Course()
	   {
	       this.name = "deafult name";
	       this.code = "default code";
	       //this.students = "Default";
	       //this.faculty = "Default faculty";
	   }
	   Course(String name, String code)
	   {
	       this.name = name;
	       this.code = code;
	   }
	   
	   Course(String name, String code, ArrayList<Student> students, Faculty faculty)
	   {
	       this.name = name;
	       this.code = code;
	       this.students = students;
	       this.faculty = faculty;
	    
	   }
	   
	   public void addStudents(Student student)
	   {
	       students.add(student);
	   }
	   public void setFaculty(Faculty faculty)
	   {
	       this.faculty = faculty;
	   }
	   public String getName()
	   {
	       return this.name;
	   }
	   public String getCode()
	   {
	       return this.code;
	   }
	   public Faculty getFaculty()
	   {
	       return this.faculty;
	   }
	   public ArrayList<Student> getStudents()
	   {
	       return this.students;
	   }
	   
	   @Override
	   public String toString()
	   {
	       return "[Course Class]" +"\nname: " + this.name + " code: " + this.code + "\nStudents: " + this.students + "\nFaculty: " + this.faculty;
	   }
}
