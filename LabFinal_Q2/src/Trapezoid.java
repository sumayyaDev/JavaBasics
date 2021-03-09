
public class Trapezoid extends GeometricObject implements Cloneable {
	private double a;
	private double b;
	private double h;
	
	public Trapezoid() {
		super();
	}

	public Trapezoid(double a, double b, double h) {
		super();
		
		try {
			if(a<0 || b<0 || h<0) {
				throw new IllegalArgumentException("IllegalArgumentException");
			}
			this.a = a;
			this.b = b;
			this.h = h;
		}
		catch(IllegalArgumentException ex) {
			System.out.println("IllegalArgumentException");
		}
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	@Override
	public double getArea() {
		double area = (0.5 * (a+b) * h);
		return area;
	}

	@Override
	public double getPerimeter() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String toString() {
		return "Trapezoid [a=" + a + ", b=" + b + ", h=" + h + " area:" + getArea() +"]";
	}
	
	

}
