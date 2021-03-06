import java.util.Scanner;
public class TestOctagon {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your NSU ID: ");
		int id = input.nextInt();
		int dividedId = id / 100000;
		int x = dividedId % 10;
		System.out.println("You will be able to create "+ x + " number of Octagon.");
		
		Octagon[] octagon = new Octagon[x];
		
		for(int i = 0; i < x; i++) {
			System.out.print("Enter the side of the octagon no. " + (i+1) + ": ");
			double side = input.nextDouble();
			octagon[i] = new Octagon(side);
		}
		
		double maxSide = octagon[0].getSide();
		double maxArea = octagon[0].getArea();
		
		for(int i = 1; i < x; i++) {
			if(maxSide < octagon[i].getSide()) {
				maxSide = octagon[i].getSide();
				maxArea = octagon[i].getArea();
			}
		}
		
		System.out.println("Side of the largest octagon is " + maxSide);
		System.out.println("Area of the largest octagon is " + maxArea);
	}

}
