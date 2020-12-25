
import java.util.Scanner;
public class L4_Task9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the the number of sides: ");
		int n = input.nextInt();
		System.out.print("Enter the side: ");
		double side = input.nextDouble();
		//double areaOfPentagon = area(n, side);
		//System.out.print("The area of the pentagon is " + areaOfPentagon);
		
		System.out.print("The area of the pentagon is " + area(n, side));
		
	}
	public static double area(int n, double side) {
		final double PI = 3.14159;
		// Area = (n * side^2) / (4 * tan(PI / n))
		double area = (n * side * side) / (4 * Math.tan(PI / n));

		return area;
	}

}
