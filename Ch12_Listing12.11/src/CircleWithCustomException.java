import java.lang.*;

public class CircleWithCustomException {
	private double radius;
	private static int numberOfObjects = 0;
	
	public CircleWithCustomException() throws InvalidRadiusException{
		this(1.0);
	}
	public CircleWithCustomException(double newRadius) throws InvalidRadiusException{
		setRadius(newRadius);
		numberOfObjects++;
	}
	
	public double getRadius() {
		return radius;
	}
	// Set a new radius
	public double setRadius(double newRadius) throws InvalidRadiusException{
		if(newRadius >= 0)
			radius = newRadius;
		else
			throw new InvalidRadiusException(newRadius);	
	}
	
	public static int getNumberOfObjects() {
		return numberOfObjects;
	}
	
	public double findArea() {
		return Math.PI * radius * radius;
	}

}
