import java.util.*;
public class TestOctagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the side of Octagon: ");
		double side = input.nextDouble();
		
		Octagon octagon1 = new Octagon(side);
		
		System.out.println("Octagon Area: " + octagon1.getArea() + "\nOctagon Perimeter: " + octagon1.getPerimeter());
		
		Octagon octagon2 = (Octagon)octagon1.clone();
		int result = octagon1.compareTo(octagon2);
		if(result == 1)
			System.out.println("Octagon is greater than it's clone.");
		else if(result == -1)
			System.out.println("Octagon is smaller than it's clone.");
		else
			System.out.println("Octagon is equal to it's clone.");
	}

}
