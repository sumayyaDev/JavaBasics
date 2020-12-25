
import java.util.Scanner;
public class L2_Task6 {

	public static void main(String[] args) {
		// Compute the perimeter of a triangle
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give three edges for a triangle\\\\");
		System.out.print("The value of edge-1: ");
		double edge1 = input.nextDouble();
		System.out.print("The value of edge-1: ");
		double edge2 = input.nextDouble();
		System.out.print("The value of edge-1: ");
		double edge3 = input.nextDouble();
		
		if(((edge1+edge2)<edge3) || ((edge2+edge3)<edge1) || ((edge3+edge1)<edge2))
			System.out.println("The inputs are invalid. The inputs will be valid if the sum of every pair of two edges is greater than the remaining edge.");  
		else
		{
			double perimeter = (edge1 + edge2 + edge3);
			System.out.println("The perimeter of the triangle is " + perimeter);
		}
		input.close();
	}

}
