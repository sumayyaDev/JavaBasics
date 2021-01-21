import java.util.*;
public class TestLab10_Task3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GeometricObject[] geoArray = new GeometricObject[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print("\nEnter the side of the square " + (i+1) + ": ");
			double side = input.nextDouble();
			geoArray[i] = new Square(side);
			System.out.println("The area of the squre is: " + ((Square)geoArray[i]).getArea());
			((Square)geoArray[i]).howToColor();
		}
		input.close();
	}

}
