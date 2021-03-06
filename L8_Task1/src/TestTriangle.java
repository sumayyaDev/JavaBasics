import java.util.Scanner;
public class TestTriangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle triangle = new Triangle(side1, side2, side3);
		
		System.out.print("Enter a color: ");
		String color = input.next();
		triangle.setColor(color);
		
		System.out.print("Is the trianngle filled(true / false): ");
		boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		
		GeometricObject ob = new GeometricObject();
				
		System.out.println("Area: " + triangle.getArea() + "\nPerimeter: " + triangle.getPerimeter());
		System.out.println("Color: " + triangle.getColor() + "\nIsFilled: " + triangle.isFilled());
		System.out.println(triangle.toString() + "   " + ob.toString());
	}

}
