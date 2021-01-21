
public class Circle extends GeometricObject implements Comparable {
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
		return Math.PI*radius*radius;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}

	@Override
	public int compareTo(Object o) {
		if(getArea() > ((Circle)o).getArea())
			return 1;
		else if(getArea() < ((Circle)o).getArea())
			return -1;
		else
			return 0;		
	}
	
	public static Circle max(Circle c1, Circle c2) {
		if(((Comparable)c1).compareTo(c2) > 0)
			return c1;
		else
			return c2;
		
	}

}
