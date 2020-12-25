
public class Octagon {
	
	private double side; 
	public int numberOfOctagon;
	
	public Octagon() {
		
	}
    public Octagon(double side) {
		this.side = side;
		numberOfOctagon++;
	}
    
    public double getSide() {
    	return side;
    }
    public void setSide(double side) {
    	this.side = side;
    }
    
    public double getArea() {
    	return (2+(4/Math.sqrt(2)))*side*side;
    }
    public double getPerimeter() {
    	return 8*side;
    }
}
