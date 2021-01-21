
public class Circle extends GeometricObject implements Comparable<Circle> {
	private double radius;

	public Circle() {
		super();
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius;
	}
	
	
	// compareTo method
	public int compareTo(Circle c) {
		if(getArea() > c.getArea())
			return 1;
		else if(getArea() < c.getArea())
			return -1;
		else
			return 0;
	}
	// equals method
	public boolean equals(Circle c) {
		if(getRadius() == c.getRadius())
			return true;
		else
			return false;
	}
}
