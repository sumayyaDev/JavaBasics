
public class Circle2D {
	
	private double x;
	private double y;
	private double radius;
	
	public Circle2D() {
		
	}
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public double getArea() {
		return Math.PI * radius * radius;
	}
	public double getPerimeter() {
		return 2 * Math.PI * radius; 
	}
	
	// Is (x,y) point inside  this.circle
	public boolean contains(double x, double y) {      
		double dis = distance(x ,y, this.x, this.y);
		return dis <= radius;
	}
	// Is circle inside this.circle
	public boolean contains(Circle2D circle) {        
		double dis = distance(this.x, this.y, circle.x, circle.y);
		return (dis+circle.radius) <= this.radius;
	}
	// Is circle overlaps this.circle
	public boolean overlaps(Circle2D circle) {
		double dis = distance(this.x, this.y, circle.x, circle.y);
		return dis <= radius + circle.radius;
	}
	
	
	public double distance(double x1, double y1, double x2, double y2) {
		return Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
	}
	

}
