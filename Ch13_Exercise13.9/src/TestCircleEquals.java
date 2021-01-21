import java.util.*;
public class TestCircleEquals {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the first Circle(c1): ");
		double radius1 = input.nextDouble();
		System.out.print("Enter the radius of the first Circle(c1): ");
		double radius2 = input.nextDouble();
		
		Circle c1 = new Circle(radius1);
		Circle c2 = new Circle(radius2);
		
		System.out.println("\nCircle c1 is " + (c1.equals(c2)? "" : "not") + " equal to Circle c2.");
		
		

	}

}
