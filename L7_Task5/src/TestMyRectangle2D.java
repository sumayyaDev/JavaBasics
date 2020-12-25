
public class TestMyRectangle2D {

	public static void main(String[] args) {
		
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);
		System.out.println("The area of the triangle is " + r1.getArea() +".\nThe perimeter of the triangle is " + r1.getPerimeter() + ".");
		
		System.out.println();
		System.out.println("The point (3, 3) is inside this rectangle: " + r1.contains(3, 3));
		System.out.println("The specified rectangle(new MyRectangle2D(4, 5, 10.5, 3.2) is inside the rectangle r1: " + r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
		System.out.println("The specified rectangle(new MyRectangle2D(3, 5, 2.3, 5.4) overlaps the rectangle r1: " + r1.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

	}

}
