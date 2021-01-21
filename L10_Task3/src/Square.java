
public class Square extends GeometricObject implements Colorable {

	private double side;
	
	public Square(double side) {
		super();
		this.side = side;
	}
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	@Override
	public void howToColor() {
		// display the message Color all four sides.
		System.out.println("Color all four sides");
	}
	
	public double getArea() {
		return side*side;
	}
	public double getPerimeter() {
		return 4*side;
	}

}
