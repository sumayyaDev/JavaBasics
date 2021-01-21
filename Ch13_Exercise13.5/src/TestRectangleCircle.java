import java.util.Scanner;
public class TestRectangleCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle1: ");
		double radius1 = input.nextDouble();
		System.out.print("Enter the radius of the circle2: ");
		double radius2 = input.nextDouble();
		Circle c1 = new Circle(radius1);
		Circle c2 = new Circle(radius2);
		
		System.out.print("Enter the width & height of the rectangle1: ");
		double width1 = input.nextDouble();
		double height1 = input.nextDouble();
		System.out.print("Enter the width & height of the rectangle2: ");
		double width2 = input.nextDouble();
		double height2 = input.nextDouble();
		Rectangle r1 = new Rectangle(width1, height1);
		Rectangle r2 = new Rectangle(width2, height2);
		
		System.out.println("c1.compareTo(c2)? "+ c1.compareTo(c2));
		System.out.println("r1.compareTo(r2)? "+ r1.compareTo(r2));
		
//		System.out.println("The area of the max circle is: " + Circle.max(c1, c2).getArea());
//		System.out.println("The area of the max rectangle is: " + Rectangle.max(r1, r2).getArea());
		
		GeometricObject[] geo = new GeometricObject[2];
		for(int i = 0; i < geo.length; i++) {
			if(i == 0) {
				System.out.println("The area of the max circle is[max(c1, c2)] : "+ Circle.max(c1, c2).getArea());
			}
			else
				System.out.println("The area of the max rectangle is[max(r1, r2)] : " + Rectangle.max(r1, r2).getArea());
		}
	}
}
