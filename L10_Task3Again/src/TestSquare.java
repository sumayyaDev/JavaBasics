import java.util.Scanner;

public class TestSquare {

	public static void main(String[] args) {
		// Write a test program that creates an array of five GeometricObjects.
		// For each object in the array, display its area and invoke its howToColor method if it is colorable.
		GeometricObject[] geo = new GeometricObject[5];
		Scanner input = new Scanner(System.in);
		
		for(int i = 0; i < 5; i++) {
			System.out.print("Enter the side of the squre no." + (i+1) +" : ");
			double side = input.nextDouble();
			geo[i] = new Square(side);
			System.out.print("The area of the square is: " + geo[i].getArea());
			
			((Square)geo[i]).howToColor();
		}
		input.close();
	}

}
