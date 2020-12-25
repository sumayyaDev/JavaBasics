
import java.util.Scanner;
public class L1_Task3 {

	public static void main(String[] args) {
		// Write a program that displays the area and perimeter of a circle
		final double PI = 3.1416;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius: ");
		double radius = input.nextDouble();
		double area = radius * radius * PI;
		double perimeter = 2 * PI * radius;
		
		System.out.println("The area of the circle is: " + area);
		System.out.println("The perimeter of the circle is: " + perimeter);

	}

}
