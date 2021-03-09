import java.util.*;
import java.io.*;
public class TestRhombusTrapezoid {

	public static void main(String[] args) throws Exception{
		Scanner input = new Scanner(System.in);
		
		int x = 4; //ID: 2013467642
		GeometricObject[] geo = new GeometricObject[x];
		
		File file = new File("TrigonometricShape.txt");
		if(file.exists()) {
			System.out.println("The file already exists.");
			System.exit(1);
		}
		
		//PrintWriter write = new PrintWriter(file);
		
		for(int i = 0; i < geo.length; i++) {
			PrintWriter write = new PrintWriter(file);
			System.out.print("Ensure what type of GeometricObject to create (1-for Rhombus, 2- for Trapezoid):");
			int type = input.nextInt();
			if(type == 1) {
				System.out.print("Enter the side and height of Rhombus: ");
				double s = input.nextDouble();
				double h = input.nextDouble();
				geo[i] = new Rhombus(s, h);
				write.println(((Rhombus)geo[i]).toString());
			}
			if(type == 2) {
				System.out.print("Enter the length of parallel sides(a & b) and the perpendicular height (h): ");
				double a = input.nextDouble();
				double b = input.nextDouble();
				double h = input.nextDouble();
				geo[i] = new Trapezoid(a, b, h);
				write.println(((Trapezoid)geo[i]).toString());
			}			
		}
//		File file = new File("TrigonometricShape.txt");
//		if(file.exists()) {
//			System.out.println("The file already exists.");
//			System.exit(1);
//		}
		//PrintWriter write = new PrintWriter(file);
//		for(int i = 0; i < geo.length; i++) {
//			write.println(geo[i].toString());
//		}
		
	}
}
