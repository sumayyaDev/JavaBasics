import java.util.Scanner;
public class ClassManagement {
	/*Name: Akter
	 * ID: 2013467642
	 * SEC: 03
	 */
	public static void main(String[] args) {
		String coursename, code;
        Scanner input = new Scanner(System.in);
        System.out.println("Please input the coursename: ");
        coursename = input.nextLine();
        System.out.println("Please input the course code: ");
        code = input.nextLine();
        Course c1 = new Course(coursename, code);
//        if (c1 == null)
//        {
//            System.out.println("Object creation failed!");
//        }
//        else
//            System.out.println("Object created successfully");
        String nameFac, id, dobFac, addressFac, designation;
        System.out.println("Faculty name: ");
        nameFac = input.nextLine();
        System.out.println("Faculty ID: ");
        id = input.nextLine();
        System.out.println("Faculty DOB: ");
        dobFac = input.nextLine();
        System.out.println("Faculty Address: ");
        addressFac = input.nextLine();
        System.out.println("Faculty designation: ");
        designation = input.nextLine();
        
        Faculty f1 = new Faculty(nameFac, id, dobFac, addressFac, designation);
        //System.out.println("Please define the number of total students you want to add to the student list:");
        //int numSt = input.nextInt();
        //for(int i =0; i<numSt; i++)
        
            System.out.println("Input Name, ID , dob, address, cgpa seperated by enter:");
            String name = input.nextLine();
            String IDs = input.nextLine();
            String dobS = input.nextLine();
            String address = input.nextLine();
            input.nextLine();
            String cgpa = input.nextLine();
            
            Student s1 = new Student(name, IDs, dobS, address, cgpa);
            System.out.println(s1);
            System.out.println(f1);
            
            c1.addStudents(s1);
            c1.setFaculty(f1);
            System.out.println(c1);	
	}

}
