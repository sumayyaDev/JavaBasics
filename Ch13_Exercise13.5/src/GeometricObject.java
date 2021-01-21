import java.util.*;
public abstract class GeometricObject implements Comparable{
	private String color = "white";
	private boolean filled = false;
	private java.util.Date dateCreated;
	public GeometricObject() {
		super();
	}
	public GeometricObject(String color, boolean filled) {
		super();
		this.color = color;
		this.filled = filled;
	}
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isFilled() {
		return filled;
	}
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();
	
	// max method
	public static Object max(Object o1, Object o2) {
		if(((Comparable)o1).compareTo(o2) > 0)
			return o1;
		else
			return o2;
		
	}
}
