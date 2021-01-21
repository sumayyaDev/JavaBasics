import java.util.*;
public class SumAreasOfGeometricObjects {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the radius of Circle1: ");
		double radius1 = input.nextDouble();
		System.out.print("Enter the radius of Circle2: ");
		double radius2= input.nextDouble();
		System.out.print("Enter the width & height of rectangle1: ");
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter the width & height of rectangle2: ");
		double width2 = input.nextDouble();
		double height2= input.nextDouble();
		input.close();
		
		GeometricObject[] geo = {new Circle(radius1), new Circle(radius2), new Rectangle(width1, height1), new Rectangle(width2, height2)};
		System.out.println("\nTotal area of two Circles and two Rectangles is: " + sumArea(geo));
	}
	
	public static double sumArea(GeometricObject[] a) {
		int sum = 0;
		for(GeometricObject x : a) {
			sum += x.getArea();
		}
		return sum;
	}
}
