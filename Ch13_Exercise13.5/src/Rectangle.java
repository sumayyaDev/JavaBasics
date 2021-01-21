
public class Rectangle extends GeometricObject implements Comparable {
	private double width;
	private double height;

	public Rectangle() {
		super();
	}
	
	public Rectangle(double width, double height) {
		super();
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getArea() {
		return width*height;
	}
	public double getPerimeter() {
		return 2*(width+height);
	}

	@Override
	public int compareTo(Object o) {
		
		if(getArea() > ((Rectangle)o).getArea())
			return 1;
		else if(getArea() < ((Rectangle)o).getArea())
			return -1;
		else
		    return 0;
	}
	
	public static Rectangle max(Rectangle r1, Rectangle r2) {
		if(((Comparable)r1).compareTo(r2) > 0)
			return r1;
		else
			return r2;
		
	}

}
