
import java.util.Scanner;
public class MyTriangle {

	public static void main(String[] args) {
		/*
		 * Write a test program that reads three sides for a triangle and computes the
		 * area if the input is valid. Otherwise, it displays that the input is invalid.
		 */
		Scanner input = new Scanner(System.in);
		System.out.print("Enter three sides for a triangle: ");
		double side1 = input.nextDouble();
		double side2 = input.nextDouble();
		double side3 = input.nextDouble();
		
		boolean truthValue = isValid( side1, side2, side3);
		System.out.println(truthValue? "Input is valid" : "Input is Invalid");
		if(truthValue == true) {
		double computeArea = area(side1, side2, side3);
		System.out.printf("The area of the triangle is: " + "%.3f", computeArea);
		}
		
	}
	// Return true if the sum of any two sides is greater than the third side.
	public static boolean isValid(double side1, double side2, double side3) {
		boolean truthValue;
		if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)) {
			truthValue = true;
		}
		else
			truthValue = false;
		
		return truthValue;
	}
	// Return the area of the triangle.
	public static double area(double side1, double side2, double side3) {
		double s = (side1 + side2 + side3) / 2.0;
		double computeArea =Math.sqrt(s * (s - side1) * (s - side1) * (s - side1));
		return computeArea;
	}

}
