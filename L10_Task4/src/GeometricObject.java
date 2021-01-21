
public abstract class GeometricObject {
	private String color = "white";
	private boolean filled = false;
	private java.util.Date dateCreated;
	
	protected GeometricObject() {
		super();
		dateCreated = new java.util.Date();
	}

	protected GeometricObject(String color, boolean filled) {
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

	@Override
	public String toString() {
		return "GeometricObject [color=" + color + ", filled=" + filled + ", dateCreated=" + dateCreated + "]";
	}
	
	public abstract double getArea();
	public abstract double getPerimeter();

}
