package Assignment2_Task4_2013467642;


public class TestSubClasses {

	public static void main(String[] args) {
		
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(10, 30.5);
		System.out.println("\nThe distance between the points is " + p1.distance(p2));
		System.out.println();
		
		// Create object for triangle 2D class
		Triangle2D t1 = new Triangle2D(new MyPoint(2.5, 2), new MyPoint(4.2, 3), new MyPoint(5, 3.5));
		
		System.out.println("The area of the triangle is " + t1.getArea());
		
		
		System.out.println("The perimeter of the triangle is " + t1.getPerimeter());
		
		System.out.println("Poin(3,3) is inside triangle: " + t1.contains(3, 3));
		System.out.println("Triangle of points((2.9,2), (4,1), (1,3.4)) is inside this triangle: " + t1.contains(new Triangle2D(2.9, 2, 4, 1, 1, 3.4)));
		System.out.println("Triangle of points ((2,5.5), (4,-3), (2,6.5)) overlaps this triangle: " + t1.contains(new Triangle2D(2, 5.5, 4, -3, 2, 6.5)));

	}

}
