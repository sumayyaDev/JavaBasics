
import java.util.Scanner;
import java.lang.math;
public class L2_Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the value of a: ");
		double a = input.nextDouble();
		
		System.out.print("Enter the value of b: ");	
		double b = input.nextDouble();
		
		System.out.print("Enter the value of c: ");
		double c = input.nextDouble();
		
		double discriminant = b*b - 4*a*c;
		
		double r1 = (-b+Math.sqrt(discriminant)) / (2*a);
		double r2 = (-b-Math.sqrt(discriminant)) / (2*a);
		
		if(discriminant > 0)
			System.out.println("r1: " + r1 + "\n" + "r2: " + r2);
		if(discriminant == 0)
			System.out.println(r1);
		if(discriminant < 0)
			System.out.println("The equation has no real roots!");
	}

}
