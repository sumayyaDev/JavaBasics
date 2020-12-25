package TASK4_copyPaste;

public class Test {

	public static void main(String[] args) {
		
		Triangle2D r1 = new Triangle2D(new MyPoint(2.5,2), new MyPoint(4.2,3), new MyPoint(5,3.5));

        System.out.println("Area is " + r1.getArea());
        System.out.println("Perimeter is " + r1.getPerimeter());
        System.out.println("Point is inside triangle: " + r1.contains(3, 3));

        System.out.println("Triangle 2 is inside this triangle: " + r1.contains( new Triangle2D(2.9, 2, 4, 1, 1, 3.4)));
        System.out.println("Triangle 3 is overlaps this triangle: " + r1.overlaps(new Triangle2D(2, 5.5, 4, -3, 2, 6.5)));

    }

	}

