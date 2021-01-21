
public class Hexagon extends GeometricObject implements Drawable {	
	private double side;
	
	public Hexagon() {
		super();
	}

	public Hexagon(double side) {
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
	public void howToDraw() {
		System.out.println("Draw all the sides.");
	}

	@Override
	public double getArea() {
		double area = ((3*Math.sqrt(2))/2)*side*side;
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 6*side;
	}

}
