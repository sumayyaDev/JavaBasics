
public class TestCircle2D {

	public static void main(String[] args) {
		/* Write a test program that
		 * creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)), displays its area and perimeter, and
		 * displays the result of c1.contains(3, 3), 
		 * c1.contains (new Circle2D(4, 5, 10.5)), and
		 * c1.overlaps(new Circle2D(3, 5, 2.3)).
		*/ 
		
		Circle2D c1 = new Circle2D(2, 2, 5.5);
		System.out.println("The area of the Circle2D(2, 2, 5.5) is : " + c1.getArea());
		System.out.println("The perimeter of the Circle2D(2, 2, 5.5) is : " + c1.getPerimeter());
		
		System.out.println("c1.contains(3,3)? " + c1.contains(3, 3));
		System.out.println("c1.contains(new Circle2D(4,5,10.5)? " + c1.contains(new Circle2D(4, 5, 10.5)));
		System.out.println("c1.overlaps(new Circle2D(3,5,2.3)? " + c1.overlaps(new Circle2D(3, 5, 2.3)));
		
		/* Another way to declare */
//		Circle2D newCircle1 = new Circle2D(4, 5, 10.5);
//		Circle2D newCircle2 = new Circle2D(3, 5, 2.3);
//		
//		System.out.println("c1.contains(3,3)? " + c1.contains(3, 3));
//		System.out.println("c1.contains(new Circle2D(4,5,10.5)? " + c1.contains(newCircle1));
//		System.out.println("c1.overlaps(new Circle2D(3,5,2.3)? " + c1.overlaps(newCircle2));

	}

}
