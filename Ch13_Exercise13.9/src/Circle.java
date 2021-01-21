
public class Circle extends GeometricObject implements Comparable<Circle> {
	
	private double radius;
	
	public Circle() {
		
	}
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius() {
		this.radius = radius;
	}
	

	@Override
	public double getArea() {
		
		return Math.PI * radius * radius;
	}

	@Override
	public double getPerimeter() {
		
		return 2 * Math.PI * radius;
	}
	
	public int compareTo(Circle c) {
		if(getRadius() > c.getRadius())
			return 1;
		else if(getRadius() < c.getRadius())
			return -1;
		else
			return 0;
	}
	
	public boolean equals(Circle c) {
		if(getRadius() == c.getRadius())
			return true;
		else
			return false;
	}
}
