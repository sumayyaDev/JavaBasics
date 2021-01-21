
public class CircleWithException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithException() {
		this(1.0);
	}
	public CircleWithException(double newRadius) {
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) throws IllegalArgumentException{ //Declare exception in setter method
			if(newRadius >= 0)
				radius = newRadius;
			else
				throw new IllegalArgumentException("Radius cannot be negative"); //Throw exception
		}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}
}
