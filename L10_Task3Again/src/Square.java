
public class Square extends GeometricObject implements Colorable {
	
	private double side1;
	
	public Square() {
		super();
	}

	public Square(double side1) {
		super();
		this.side1 = side1;
	}
	public double getSide1() {
		return side1;
	}

	public void setSide1(double side1) {
		this.side1 = side1;
	}

	@Override
	public void howToColor() {
		System.out.println("Color all four sides");
	}

	@Override
	public double getArea() {
		
		return side1 * side1;
	}

	@Override
	public double getPerimeter() {
		
		return 4 * side1;
	}

}
