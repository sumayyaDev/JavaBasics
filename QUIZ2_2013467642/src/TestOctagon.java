import java.util.Scanner;
public class TestOctagon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		int x = 4;  // ID_2013467642
		Octagon octagon = new Octagon();
		
		for(int i=0; i < x; i++) {
			System.out.print("Enter the side of the octagon: ");
			double side = input.nextDouble();
			octagon.setSide(side);
			Octagon octagon2 = new Octagon(side);
			System.out.println("Area is: " + octagon.getArea());
			System.out.println("Perimeter is: " + octagon.getPerimeter());
			
;		}
		System.out.println("\nThe Area of the largest location is: " + octagon.getArea());

	}

}
