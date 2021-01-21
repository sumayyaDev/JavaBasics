import java.util.Scanner;
public class TestCircleRectangle {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		/*Write a test program that creates an array of four objects (two circles and two rectangles) and
		 *computes their total area using the sumArea method.*/
		GeometricObject[] array = {new Circle(3), new Circle(4), new Rectangle(4 , 5), new Rectangle(4, 3)};
		
		System.out.println("Toatal area of all GeometricObject is : " + sumArea(array));
	}
	
	public static double sumArea(GeometricObject[] a) {
		double sum = 0;
		for(int i = 0; i < a.length; i++) {
			sum += a[i].getArea();
		}
		return sum;
	}
}
