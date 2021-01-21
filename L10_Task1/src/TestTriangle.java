import java.util.Scanner;
public class TestTriangle{

	public static void main(String[] args) {
		
		/* Write a test program that prompts the user to enter 
		 * three sides of the triangle, a color, and a Boolean value to indicate whether the triangle is filled. 
		 * The program should create a Triangle object with these sides and set the color and filled properties using the input.
		 *  The program should display the area, perimeter, color, and true or false to indicate whether it is filled or not.
		*/
		Scanner input = new Scanner(System.in);
		//Triangle triangle = new Triangle();
		System.out.print("Enter three sides of the triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		Triangle triangle = new Triangle(side1, side2, side3);
		System.out.print("Enter a color: ");
		String color = input.next();
		triangle.setColor(color);
		System.out.print("Is the triangle filled(true/false): ");
		boolean filled = input.nextBoolean();
		triangle.setFilled(filled);
		
		System.out.println("\nTriangle [Area: " + triangle.getArea() + ",   Perimeter: " + triangle.getPerimeter() + ",   Color: " + triangle.getColor() + ",   isFilled: " + triangle.isFilled() + "]");
	}

}
