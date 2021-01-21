
public class Octagon extends GeometricObject implements Comparable, Cloneable {
	private double side;
	
	public Octagon() {
		super();
	}
	public Octagon(double side) {
		this.side = side;
	}
	
	public double getSide() {
		return side;
	}
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return (2+4/Math.sqrt(2))*side*side;
	}
	public double getPerimeter() {
		return 8*side;
	}
	
	public int compareTo(Object o) {
		if(getArea() > ((Octagon)o).getArea())
			return 1;
		else if(getArea() > ((Octagon)o).getArea())
			return -1;
		else
			return 0;	
	}
	
	//clone method
//	public Object clone() throws CloneNotSupportedException{
//		return super.clone();
//	}
	
	public Object clone() {
        Object o = null;
        try {
            o = super.clone();
        } catch (CloneNotSupportedException ex) {
            ex.printStackTrace();
        }
        return o;
    }
}
