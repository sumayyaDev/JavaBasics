import java.util.Scanner;
public class TestCircle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter two radius of two circles: ");
		double radius1 = input.nextDouble();
		double radius2 = input.nextDouble();
		
		Circle c1 = new Circle(radius1);
		Circle c2 = new Circle(radius2);
		
		System.out.println("Circle c1 [Area: " + c1.getArea() + " and perimeter: " + c1.getPerimeter());
		System.out.println("Circle c2 [Area: " + c2.getArea() + " and perimeter: " + c2.getPerimeter());
		System.out.println("Circle c1 is " + (c1.equals(c2)? "" : "not") + " equal to circle c2.");
		System.out.println("Circle (c1.compareTo(c2))? " + c1.compareTo(c2));

	}

}
