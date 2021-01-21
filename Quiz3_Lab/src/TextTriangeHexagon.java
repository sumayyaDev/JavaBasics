import java.util.Scanner;
public class TextTriangeHexagon {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int x = 7;
		GeometricObject[] geo = new GeometricObject[7];
		
		int index = 0;
		for(int i = 0; i < geo.length; i++) {
			System.out.print("Enter three sides of the Triangle no." + (i+1) +" : ");
			double side1 = input.nextDouble();
			double side2 = input.nextDouble();
			double side3 = input.nextDouble();
			geo[i] = new Triangle(side1, side2, side3);
			((Triangle)geo[i]).getArea();
			System.out.print("Enter the side of the Hexagon : ");
			double side = input.nextDouble();
			geo[i] = new Hexagon(side);
			((Hexagon)geo[i]).getArea();
		}
		double maxAreaTriangle = ((Triangle)geo[0]).getArea();
		double maxAreaHexagon = ((Hexagon)geo[0]).getArea();
		//int index = 0;
		for(int i = 1; i < geo.length; i++) {
			if(maxAreaTriangle < ((Triangle)geo[i]).getArea()) {
				maxAreaTriangle = ((Triangle)geo[i]).getArea();
				index = i;
				((Triangle)geo[i]).howToDraw();
			}
			if(maxAreaHexagon < ((Hexagon)geo[i]).getArea()) 
				maxAreaHexagon = ((Hexagon)geo[i]).getArea();
		}
		System.out.println("The maximum area of the triangle is: " + maxAreaTriangle);
		System.out.println("The maximum area of the hexagon is: " + maxAreaHexagon);

	}

}
