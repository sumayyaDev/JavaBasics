
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("John", "12 Bell street", "3473339999", "john12@aol.com");
		Student student = new Student("Marry", "100 Town Ave", "5149993333", "mary100@a0l.com", Student.FRESHMAN);
		Employee employee = new Employee("Mike", "34 West street", "6181119999", "mike80@aol.com", "Bangladesh Bank", 30000, new MyDate(1, 21, 2014));
		Faculty faculty = new Faculty("Sue", "28 Well street", "4134566666", "sue28@aol.com", "North South", 60000, new MyDate(5, 16,2015), "4pm to 6pm", Faculty.PROFESSOR);
		Staff staff = new Staff("Tom", "90 coubtry road", "2031234567", "tomcat@aol.com", "North South", 55000, new MyDate(9, 28, 2018), "Executive Assistant");
		
		
		System.out.println(person.toString() + "\n");
		System.out.println(student.toString() + "\n");
		System.out.println(employee.toString() + "\n");
		System.out.println(faculty.toString() + "\n");
		System.out.println(staff.toString() + "\n");
		
	}
}